package Utils;

public class GenerateRandomAlphanumericString {
    public String generateRandomAlphanumericString(int size) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder stringBuilder = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());

            stringBuilder.append(AlphaNumericString
                    .charAt(index));
        }
        return stringBuilder.toString();
    }
}
