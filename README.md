abandoned project

continuation : [RCZ CONTINUATION](https://github.com/Halqq/RCZEncryptationKT)

# RCZEncryptation
RCZ Encrypt uses maps to encrypt your string

This use random chars bytes to transforme one char

[A] -> [65] -> b -> [98] + 前今&前u@ == 8前9今&前u8@

and this put random bytes converted into string

(前今&前u@) -> bytes -> after random byte

CharForString -> randomChar -> randomCharBytes == [-1] -> new char -> random bytes -> randomBytesInString -> prefix == $HalqRCZ!$ -1前今&前u@...

# How to use

To encode: 

```java
EncryptRCZ.encryptRCZ(EncryptRCZ.ENCODE_MODE, "input text");
```

To decode:
```java
EncryptRCZ.encryptRCZ(EncryptRCZ.DECODE_MODE, "encoded text");
```
# Example

```java
EncryptRCZ.encryptRCZ(EncryptRCZ.ENCODE_MODE, "hello world");
```
hello world == $HalqRCZ!$ 73円後)前@&前7*79円後)前@&前7*77円後)前@&前7*77円後)前@&前7*80円後)前@&前7* 65円後)前@&前7*80円後)前@&前7*88円後)前@&前7*77円後)前@&前7*78円後)前@&前7*
