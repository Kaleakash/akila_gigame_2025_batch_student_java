package interfaceexample;

interface A {
    int X=100;
    void dis1();
}
interface B {
    int Y=100;
    void dis2();
}
interface C extends A,B{
    int Z=100;
    void dis3();
}
class Test implements C{
    @Override
    public void dis1() {}
    @Override
    public void dis2() {}
    @Override
    public void dis3() {}
}
public class InterfaceExample {
}
