/**
 * @author Halq
 * @since 08/10/22
 */

public class RCZTransformer {

    static String prefix = "$HalqRCZ!$ ";

    static String random = EncryptMapping.randomAlphabet();

    static String getRandom = random;

    public static String encodeBytes(String input) {
        EncryptMapping.INSTANCE.res();
        StringBuffer output = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            String vq = input.charAt(i) + "";
            if (EncryptMapping.INSTANCE.byteHashMap.containsKey(vq)) {
                output.append(EncryptMapping.INSTANCE.byteHashMap.get(vq));
                output.toString().replace("[", "");
            } else {
                output.append(vq);
            }
        }

        System.out.println("[RCZ] Updating Bytes" + output);
        return prefix + output.toString().replace("[", "").replace("]", getRandom);
    }

    public static String removeAbsP(String input) {
        if (input.startsWith(prefix)) {
            return input.replace(getRandom, "-").replace(prefix, "");
        } else if (input.startsWith("[" + prefix)) {
            return input.replace(getRandom, "-").replace("[" + prefix, "").replace("]", "");
        }
        return input.replace(getRandom, "-");
    }

    public static String decodeBytes(String e) {
        String input = removeAbsP(e);

        System.out.println("[RCZ Reverse Engineering Bytes: " + EncryptMapping.revertMap(EncryptMapping.revertBytes(input)));

        return EncryptMapping.revertMap(EncryptMapping.revertBytes(input));
    }
}
