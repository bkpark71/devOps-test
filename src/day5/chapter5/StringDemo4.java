package day5.chapter5;

public class StringDemo4 {
  public static void main(String[] args) {
    String s1 = "abc";

    System.out.println(String.format("%s %d", "JDK", 17));

    System.out.println(String.join(", ", "A", "B", "C", "D"));

    System.out.println(String.valueOf(10) + 10); // 10 + "" = "10"
    System.out.println(String.valueOf(3.14 * 10 * 10));
    System.out.println(String.valueOf('c') + 10);

    String html1 =
        "<html>\n" +
            "\t<body>\n" +
            "\t</body>\n" +
            "\t\t<p>\"안녕하세요\"</p>\n" +
            "</html>";

    String html2 = """
        <html>
             <body>
                <p>"안녕하세요"</p>
             </body>
        </html>
           """;
    System.out.println(html1);
    System.out.println(html2);
  }
}
