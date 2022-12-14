
import java.util.*;

/**
 * @author Halq
 * @since 06/10/22
 */

public class RCZMapping {

    static RCZMapping INSTANCE = new RCZMapping();
    static List<String> stringList = new ArrayList<>();
    HashMap<String, String> byteHashMap = new HashMap<String, String>();
    HashMap<String, String> reverseHashMap = new HashMap<String, String>();


    public RCZMapping() {
        INSTANCE = this;
    }

    public String revertBytes(String input) {

        return input.replace("97", "a").replace("98", "b").replace("99", "c").
                replace("100", "d").replace("101", "e").replace("102", "f").
                replace("103", "g").replace("104", "h").replace("105", "i").
                replace("106", "j").replace("107", "k").replace("108", "l").
                replace("109", "m").replace("110", "n").replace("111", "o").
                replace("112", "p").replace("113", "q").replace("114", "r").
                replace("115", "s").replace("116", "t").replace("117", "u").
                replace("118", "v").replace("119", "w").replace("120", "x").
                replace("121", "y").replace("122", "z").replace("65", "A").
                replace("66", "B").replace("67", "C").replace("68", "D").
                replace("69", "E").replace("70", "F").replace("71", "G").
                replace("72", "H").replace("73", "I").replace("74", "J").
                replace("75", "K").replace("76", "L").replace("77", "M").
                replace("78", "N").replace("79", "O").replace("80", "P").
                replace("81", "Q").replace("82", "R").replace("83", "S").
                replace("84", "T").replace("85", "U").replace("86", "V").
                replace("87", "W").replace("88", "X").replace("89", "Y").
                replace("90", "Z");
    }

    public String revertMap(String input) {

        return input.replace("b", "A").replace("z", "B").replace("f", "C").
                replace("f", "C").replace("n", "D").replace("o", "E").replace("r", "F").
                replace("v", "G").replace("i", "H").replace("j", "I").replace("k", "J").
                replace("l", "K").replace("m", "L").replace("q", "M").replace("w", "N").
                replace("p", "O").replace("t", "P").replace("e", "Q").replace("x", "R").
                replace("c", "S").replace("u", "T").replace("y", "U").replace("d", "V").
                replace("h", "Y").replace("a", "W").replace("s", "X").replace("g", "Z").
                replace("B", "a").replace("Z", "b").replace("F", "c").
                replace("F", "c").replace("N", "d").replace("O", "e").replace("R", "f").
                replace("V", "g").replace("I", "h").replace("J", "i").replace("K", "j").
                replace("L", "k").replace("M", "l").replace("Q", "m").replace("W", "n").
                replace("P", "o").replace("T", "p").replace("E", "q").replace("X", "r").
                replace("C", "s").replace("U", "t").replace("Y", "u").replace("D", "v").
                replace("H", "y").replace("A", "w").replace("S", "x").replace("G", "z");
    }

    public List<String> japaneseChar() {

        stringList.add("??????&???u@");
        stringList.add("????????????7*");
        stringList.add("??????)J)C$$#");
        stringList.add("??????)J@Zr???{}");
        stringList.add("?????????+)(???u@");
        stringList.add("??????)???J#@&???7*");
        stringList.add("??????@@S*&~C$$#");
        stringList.add("??????)??&%$#?????{}");
        stringList.add("??????Zr&???u@");
        stringList.add("?????????*_7*");
        stringList.add("??????)J@??????($#");
        stringList.add("??????)J@???N#???{}");
        stringList.add("?????????**???(???u@");
        stringList.add("??????)???@&???7*");
        stringList.add("??????@@)S$$#");
        stringList.add("??????)??J2Zr???{}");
        stringList.add("?????????+&?????@");
        stringList.add("?????????*&7*");
        stringList.add("??????()))(*$$#");
        stringList.add("?????????Zr???{}");
        stringList.add("???**???(???@@");
        stringList.add("??????%@$$#@&???7*");
        stringList.add("??????@???)8*&~C$$#");
        stringList.add("???????????$@*(???{}");
        stringList.add("+)???&%&???u@");
        stringList.add("@???Nn7*");
        stringList.add("??????()))#$$#");
        stringList.add("???N#??????Zr???{}");
        stringList.add("???*???(???u@");
        stringList.add("???J7*");
        stringList.add("??????@&~C$$#");
        stringList.add("??????)%#&%???{}");

        return stringList;
    }

    public String randomAlphabet() {

        int characters = 1;
        String name = "";
        for (int i = 0; i < characters; i++) {
            String ch = japaneseChar().get(new Random().nextInt(japaneseChar().size()));

            name += ch;
        }
        return name;
    }

    public void res() {
        byteHashMap.put("A", Arrays.toString("b".getBytes()));
        byteHashMap.put("B", Arrays.toString("z".getBytes()));
        byteHashMap.put("C", Arrays.toString("f".getBytes()));
        byteHashMap.put("D", Arrays.toString("n".getBytes()));
        byteHashMap.put("E", Arrays.toString("o".getBytes()));
        byteHashMap.put("F", Arrays.toString("r".getBytes()));
        byteHashMap.put("G", Arrays.toString("v".getBytes())); //a/b/c/d/e/f/g
        byteHashMap.put("H", Arrays.toString("i".getBytes()));
        byteHashMap.put("I", Arrays.toString("j".getBytes()));
        byteHashMap.put("J", Arrays.toString("k".getBytes()));
        byteHashMap.put("K", Arrays.toString("l".getBytes()));
        byteHashMap.put("L", Arrays.toString("m".getBytes()));
        byteHashMap.put("M", Arrays.toString("q".getBytes()));
        byteHashMap.put("N", Arrays.toString("w".getBytes()));
        byteHashMap.put("O", Arrays.toString("p".getBytes()));
        byteHashMap.put("P", Arrays.toString("t".getBytes()));
        byteHashMap.put("Q", Arrays.toString("e".getBytes()));
        byteHashMap.put("R", Arrays.toString("x".getBytes()));
        byteHashMap.put("S", Arrays.toString("c".getBytes()));
        byteHashMap.put("T", Arrays.toString("u".getBytes()));
        byteHashMap.put("V", Arrays.toString("d".getBytes()));
        byteHashMap.put("U", Arrays.toString("y".getBytes()));
        byteHashMap.put("Y", Arrays.toString("h".getBytes()));
        byteHashMap.put("W", Arrays.toString("a".getBytes()));
        byteHashMap.put("X", Arrays.toString("s".getBytes()));
        byteHashMap.put("Z", Arrays.toString("g".getBytes()));

        byteHashMap.put("a", Arrays.toString("B".getBytes()));
        byteHashMap.put("b", Arrays.toString("Z".getBytes()));
        byteHashMap.put("c", Arrays.toString("F".getBytes()));
        byteHashMap.put("d", Arrays.toString("N".getBytes()));
        byteHashMap.put("e", Arrays.toString("O".getBytes()));
        byteHashMap.put("f", Arrays.toString("R".getBytes()));
        byteHashMap.put("g", Arrays.toString("V".getBytes())); //a/b/c/d/e/f/g
        byteHashMap.put("h", Arrays.toString("I".getBytes()));
        byteHashMap.put("i", Arrays.toString("J".getBytes()));
        byteHashMap.put("j", Arrays.toString("K".getBytes()));
        byteHashMap.put("k", Arrays.toString("L".getBytes()));
        byteHashMap.put("l", Arrays.toString("M".getBytes()));
        byteHashMap.put("m", Arrays.toString("Q".getBytes()));
        byteHashMap.put("n", Arrays.toString("W".getBytes()));
        byteHashMap.put("o", Arrays.toString("P".getBytes()));
        byteHashMap.put("p", Arrays.toString("T".getBytes()));
        byteHashMap.put("q", Arrays.toString("E".getBytes()));
        byteHashMap.put("r", Arrays.toString("X".getBytes()));
        byteHashMap.put("s", Arrays.toString("C".getBytes()));
        byteHashMap.put("t", Arrays.toString("U".getBytes()));
        byteHashMap.put("v", Arrays.toString("D".getBytes()));
        byteHashMap.put("u", Arrays.toString("Y".getBytes()));
        byteHashMap.put("y", Arrays.toString("H".getBytes()));
        byteHashMap.put("w", Arrays.toString("A".getBytes()));
        byteHashMap.put("x", Arrays.toString("S".getBytes()));
        byteHashMap.put("z", Arrays.toString("G".getBytes()));

        System.out.println(byteHashMap.toString().replace(",", "\n [RCZ] Apply Mappings: "));

    }
}
