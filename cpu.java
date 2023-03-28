class cpu 
{
    int price;

    cpu(int p) 
    {
        this.price = p;
    }

    class Processor 
    {
        int cores;
        String manufacture;

        Processor(int n, String m) 
        {
            this.cores = n;
            this.manufacture = m;
        }

        void display() {
            System.out.println("No of Cores : " + this.cores);
            System.out.println("Processor manufactures : " + this.manufacture);
        }
    }

    static class Ram 
    {
        int memory;
        String manufacture;

        Ram(int n, String m) 
        {
            this.memory = n;
            this.manufacture = m;
        }

        void display() 
        {
            System.out.println("Memory Size : " + this.memory);
            System.out.println("Memory manufactures : " + this.manufacture);
        }
    }

    void display() 
    {
System.out.println("\n NAME : JAYA \n REG NO :SJC22MCA-2031 \n DATE : 28-3-2023");
System.out.println("-----------OUTPUT---------");
System.out.println("Price of cpu: " + this.price);
    }

    public static void main(String[] args) 
    {
        cpu intel = new cpu(23000);
        cpu.Processor i_processor = intel.new Processor(4, "intel");
        cpu.Ram i_ram = new Ram(1024, "Asus");
        intel.display();
        i_processor.display();
        i_ram.display();
    }
}

