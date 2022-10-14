 public class Main {

        public static void diskriminant(int a,int b, int c) {

            int pasuxi = (b * b) - 4 * (a * c);
            System.out.println(pasuxi);
        }

        public static void smalleststring(String[] arr) {

            int len = arr.length;
            String min = arr[0];

            for (int i = 0; i < (len-1); i++) {

                if (arr[i].length() > arr[i+1].length()) {
                    min = arr[i+1];
                }
            }

            System.out.println(min);

        }


    }

