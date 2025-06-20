 interface NewC {
    int add(int a,int b);
}
interface NewB{
    int add(int a ,int b);
}

class NewD implements   NewB,NewC{
    
    @Override
    public int add(int a, int b) {
        return 0;
    }
}