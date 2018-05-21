public class MirrorInfo {
    public static void main(String[] args) {

        Mirror prd1 = new Mirror(23.2, 34.5, "IKEA", false);
        Mirror prd2 = new Mirror(44.4, 23.12, "BRW", true);

        System.out.println("Product 1: hight: " + prd1.hight + ", width: "
                + prd1.width + ", made by " + prd1.maker + ". Is it clear? " + prd1.isClear);

        System.out.println("Product 2: hight: " + prd2.hight + ", width: "
                + prd2.width + ", made by " + prd2.maker + ". Is it clear? " + prd2.isClear);
    }

}