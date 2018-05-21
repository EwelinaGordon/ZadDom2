public class MirrorInfo {
    public static void main(String[] args) {

        Mirror prd1 = new Mirror();
        prd1.hight = 20.0;
        prd1.width = 45.5;
        prd1.maker = "IKEA";
        prd1.isClear = false;

        Mirror prd2 = new Mirror();
        prd2.hight = 55.5;
        prd2.width = 10.4;
        prd2.maker = "RBW";
        prd2.isClear = true;

        System.out.println("Product 1: hight: " + prd1.hight + ", width: "
                            + prd1.width + ", made by " + prd1.maker + ". Is it clear? " + prd1.isClear);

        System.out.println("Product 2: hight: " + prd2.hight + ", width: "
                + prd2.width + ", made by " + prd2.maker + ". Is it clear? " + prd2.isClear);
    }

}


