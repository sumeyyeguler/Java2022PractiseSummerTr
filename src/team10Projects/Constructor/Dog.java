package team10Projects.Constructor;

    public class Dog {
        static int numTeeth = 8;
        int numWhiskers = 13;
        int weight;

        public Dog(int weight) {
            this(weight, 16);
        }

        public Dog(int weight, int numTeeth) {
            this(weight, numTeeth, 6);
        }


        public Dog(int weight, int numTeeth, int numWhiskers) {
            this.weight += weight;
            this.numTeeth += numTeeth;
            this.numWhiskers += numWhiskers;
        }

        public void print() {
            System.out.println(weight + " " + numTeeth + " " + numWhiskers);
        }

        public static void main(String[] args) {
            Dog mouse = new Dog(15);
            mouse.print();
            Dog obj = new Dog(3, 2, 1);
            System.out.println(obj.weight);
            System.out.println(obj.numWhiskers);
            System.out.println(numTeeth);

            int sayi1=0;
            int sayi2=2;

            topla1(sayi1,sayi2);
        }

        private static void topla1(int sayi3, int sayi2) {
        }
    }
