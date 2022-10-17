public class BitMap {
    public int BitMapArray[];
    public BitMap(int[] BitMapArray) {
        this.BitMapArray = BitMapArray;
    }

    public int[] getBitMapArray() {
        return BitMapArray;
    }

    public void setBitMapArray(int[] BitMapArray) {
        this.BitMapArray = BitMapArray;
    }
    public boolean isInBitMap(int pos){
        int array_pos=pos/32;//在array数组中第几个格子里
        int offset=pos%32;//在array[array_pos]的第几位上
        int number=BitMapArray[array_pos];
        offset=1<<offset;
        int answer=number & offset;
        if(answer==offset){
            return true;
        }else{
            return false;
        }
    }
    public boolean add(int pos){
        int array_pos=pos/32;//在array数组中第几个格子里
        int offset=pos%32;//在array[array_pos]的第几位上
        int number=BitMapArray[array_pos];

        offset=1<<offset;
        number=number |offset;
        BitMapArray[array_pos]=number;
        return true;
    }
    public boolean delete(int pos){
        int array_pos=pos/32;//在array数组中第几个格子里
        int offset=pos%32;//在array[array_pos]的第几位上
        int number=BitMapArray[array_pos];
        offset=1<<offset;
        offset=~offset;
        int answer=number & offset;
        BitMapArray[array_pos]=answer;
        return true;

    }

}
