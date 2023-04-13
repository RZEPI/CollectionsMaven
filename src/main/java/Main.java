public class Main {
        public static void main(String[] args) {
            int type = Integer.parseInt(args[0]);
            Mage.setType(type);
            Mage mage1 = new Mage("Gandalf", 99, 1000.94);
            Mage mage2 = new Mage("Saruman", 98, 992.32);
            Mage mage3 = new Mage("Radagast", 65, 320.11);
            Mage mage4 = new Mage("Blue wizard one ", 44, 120);
            Mage mage5 = new Mage("Blue wizard two", 45, 122);
            Mage mage6 = new Mage("Merlin", 39, 99);
            Mage mage7 = new Mage("Hudini", 20, 60.5);
            Mage mage8 = new Mage("Doctor Strange", 80, 560.11);
            Mage mage9 = new Mage("Phil Dunphy", 1, 12.6);
            Mage mage10 = new Mage("Cleopatra", 5, 28.9);
            mage1.addApprentice(mage3);
            mage1.addApprentice(mage2);
            mage3.addApprentice(mage4);
            mage3.addApprentice(mage5);
            mage1.addApprentice(mage6);
            mage1.addApprentice(mage8);
            mage7.addApprentice(mage9);
            mage8.addApprentice(mage7);
            mage1.addApprentice(mage10);
            mage1.printStructure("");
            mage1.countStats();
            mage1.printStats();
        }
}
