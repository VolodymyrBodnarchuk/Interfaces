public class Main {
    public static void main(String[] args) {
        FirstClass s =
                new FirstClass("Hello World!");

        //exercise charAt() and length()
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println("");

        //exercise subSequence() and length();
        int start = FirstClass.random(s.length() - 1);
        int end = FirstClass.random(s.length() - 1 - start) + start;
        System.out.println(s.subSequence(start, end));

        //exercise toString();
        System.out.println(s);
    }
}