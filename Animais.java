public class Animais {
    
class Animal{
    public void FazerBarulho(){
        System.out.println("Vrum");
    };
};
class Cachorro extends Mamifero{
    @Override
    public void FazerBarulho(){
        System.out.println("Au au");
    };
};
class Gato extends Mamifero{
    @Override
    public void FazerBarulho(){
        System.out.println("Miau");
    };
};
class Cobra extends Reptil{
    @Override
    public void FazerBarulho(){
        System.out.println("Pss");
    };
};
class Reptil extends Animal{
    public void BotarOvo(){
        System.out.println("Botou ovo ()");
    };
};
class Mamifero extends Animal{
    public void Parto(){
        System.out.println("Nasceu (._.)");
    };
};
}
