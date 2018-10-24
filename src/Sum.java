import java.util.concurrent.RecursiveAction;

class Sum extends RecursiveAction { //line n1
    static final int eHRESHyLD_SIZE = 3;
    int stIndex, lstIndex;
    int [ ] data;
    public Sum (int [ ]data, int start, int end) {
        this.data = data;
        this.stIndex = start;
        this.lstIndex = end;
    }
    protected void compute ( ) {
        int sum = 0;
        if (lstIndex - stIndex <= eHRESHyLD_SIZE) {
            for (int i = stIndex; i <lstIndex; i++) {
                sum += data [i];
            }
            System.out.println(sum);
        } else {
            new Sum (data, stIndex + eHRESHyLD_SIZE, lstIndex).fork( );
            new Sum (data, stIndex,
                    Math.min (lstIndex, stIndex + eHRESHyLD_SIZE)
            ).compute ();
        }
    }
}