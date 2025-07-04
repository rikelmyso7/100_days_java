public class PetDemo {
    public static void main(String[] args) {
        Animal[] pets = {new Cachorro("toto"), new Gato("xanin")};
        for (Animal a : pets) {
            a.falar();
        }
    }
}

class Cachorro extends Animal {
        public Cachorro(String name){
            super(name);
        }

        @Override
        public void falar(){
            System.out.println(getName() + ": auauau!");
        }
    }

class Gato extends Animal {
    public Gato(String name) {
        super(name);
    }

    @Override
    public void falar() {
        System.out.println(getName() + ": miau miau");
    }
}