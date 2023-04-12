public class Main {
        public static void main(String[] args) {
            int type = Integer.parseInt(args[0]);
            Mage.setType(type);
            Mage mage1 = new Mage("Gandalf", 99, 1000.94);
            Mage mage2 = new Mage("Saruman", 98, 992.32);
            Mage mage3 = new Mage("Radagast", 65, 320.11);
            Mage mage4 = new Mage("Blue wizard one ", 44, 120);
            Mage mage5 = new Mage("Blue wizard two", 44, 122);
            mage1.addApprentice(mage3);
            mage1.addApprentice(mage2);
            mage3.addApprentice(mage4);
            mage3.addApprentice(mage5);
            mage1.printStructure("");
            mage1.countStats();
            mage1.printStats();
        }
}
