package Module1.Lesson23;

public class Example4 {
    public static void main(String[] args) {

        String str = "test";

        switch (str) {

            case "ping" -> System.out.println("ping");

            case "test" -> {System.out.println(str);
                System.out.println("Привет!");
            }
            case "bing" -> System.out.println("bing");
        }

        int[] a = {10, 12, 133, 144};

        for (int i = 0; i < a.length; i++) {
            String result = switch (a[i]){
                case 10 -> "Hi 10";
                case 12 -> "Hi 12";
                case 133 -> "Hi 133";
                case 144 -> "Hi 144";
                default -> "default";
            };
            System.out.println(result);
        }


        var b = switch (0){
            case 1 -> {
                yield 5.0; // плав точка
            }
            case 2 -> {
                yield true; //
            }
            case 3 -> {
                yield "Привет!";
            }
            default -> 7;
        };

        System.out.println(b);



    }
}
