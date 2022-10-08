# RCZEncryptation
RCZ Encrypt uses maps to encrypt your string

This use random chars bytes to transforme one char

[A] -> [65] -> b -> [98]

and this put random bytes converted into string

(前今&前u@) -> bytes -> after random byte

CharForString -> randomChar -> randomCharBytes == [-1] -> new char -> random bytes -> randomBytesInString == -1前今&前u@...

# How to use

To encode: 

```java
EncryptRCZ.encryptRCZ(EncryptRCZ.ENCODE_MODE, "input text");
```

To decode:
```java
EncryptRCZ.encryptRCZ(EncryptRCZ.DECODE_MODE, "encoded text");
```
