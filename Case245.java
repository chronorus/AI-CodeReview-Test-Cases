/*
245. Raw byte values should not be used in bitwise operations in combination with shifts
 */

/**
 *
 * @author john
 */
public class Case245 {
    int intFromBuffer() {
        int result = 0;
        for (int i = 0; i < 4; i++) {
          result = (result << 8) | readByte(); // Noncompliant
        }
        return result;
    }
}
