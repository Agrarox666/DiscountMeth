import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DiscountTest {
    public static @Nullable int[] decryptData(@NonNull int[] price,
                                       @IntRange(from = 1) int discount,
                                       @IntRange(from = 0) int offset,
                                       @IntRange(from = 1) int readLength) {
        if ((discount > 99) || (discount < 1) || ( offset < 0 ) || (offset > price.length-1) ||
        (readLength < 1) || (readLength > price.length) || (readLength + offset > price.length)) {
            return null;
        } else {
            int[] resultArray = new int[readLength];
            for (int i = 0; i < readLength; i++) {
                resultArray[i] = (int) Math.floor(price[offset + i] * discount / 100);
            }
            return resultArray;
        }

    }
}
