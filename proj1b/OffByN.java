public class OffByN implements CharacterComparator{
    private int base;
    public OffByN(int N){
        base = N;
    }
    @Override
    public boolean equalChars(char x, char y){
        int comparison = Math.abs(x - y);
        return comparison == base;
    }
}
