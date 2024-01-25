public class Laptop {
    private String name;
    private int ram;
    private int harddrive;
    private String os;
    private String color;
        public Laptop (String name, int ram, int harddrive, String os, String color) {
            this.name = name;
            this.ram = ram;
            this.ram = harddrive;
            this.os = os;
            this.color = color;
        }
        @Override
        public String toString() {
            return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n Диагональ %.1f \n",
    this.name, this.ram, this.harddrive, this.os, this.color);
        }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Laptop) {
                return this.name.equals(((Laptop) obj).name) && this.ram == ((Laptop) obj).ram
                        && this.harddrive == ((Laptop) obj).harddrive && this.os.equals(((Laptop) obj).os)
                        && this.color.equals(((Laptop) obj).color);
            }
            return false;
        }
        public int getRam(){
            return this.ram;
        }
        public int getStorageCap(){
            return this.harddrive;
        }
        public String getOS(){
            return this.os;
        }
}

