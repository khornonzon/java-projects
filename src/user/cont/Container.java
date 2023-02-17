package user.cont;
public class Container {

    private int[] arr;
    private int size;

    public Container(int l){
        arr = new int[l];
        size = l;
    }
    public Container(){
        arr = new int[0];
        size = 0;
    }

    public void set(int x, int pos) {
        try{
            arr[pos] = x;
        } catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err);
        }
    }
    public int get(int pos){
        try{
            return arr[pos];
        } catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err);
            return -1;
        }
    }

    public void RandInit(){
        for(int i = 0; i<size; i++){
            arr[i] = (int) (Math.random()*(400+1)) - 200;
        }
    }
    public void push(int x){
        int[] new_arr = new int[size+1];
        for (int i = 0; i<size; i++){
            new_arr[i] = arr[i];
        }
        new_arr[size] = x;
        arr = new_arr;
        size+=1;
    }
    public void push(int x, int pos){
        if (pos>=0 && pos<size){
            int[] new_arr = new int[size+1];
            for (int i = 0; i < pos; i++){
                new_arr[i] = arr[i];
            }
            new_arr[pos] = x;
            for (int i = pos+1; i<size+1; i++)
            {
                new_arr[i] = arr[i-1];
            }
            arr = new_arr;
            size+=1;
        }

    }
    public boolean pop(){
        boolean result = false;
        if (size>0){
            int[] new_arr = new int[size-1];
            result = true;
            for (int i = 0; i<size-1; i++) {
                new_arr[i]=arr[i];
            }
            arr = new_arr;
            size-=1;
        }
        else {
            System.out.println("There is no elements in the container.\n");
        }
        return result;
    }
    public boolean erase(int pos){
        boolean result = false;
        if (size > 0)
        {
            if (pos>=0 && pos<size) {
                int[] new_arr = new int[size-1];
                for (int i = 0; i<pos; i++){
                    new_arr[i] = arr[i];
                }
                for (int i = pos+1; i<size; i++){
                    new_arr[i-1] = arr[i];
                }
                size-=1;
                arr = new_arr;
                result = true;
            }
            else{
                System.out.println("There is no such position in the container.\n");
            }
        }
        else {
            System.out.println("There is no elements in the container.\n");
        }
        return result;
    }

    @Override
    public String toString(){
        String result = "Length: " + size + "\n";
        for (int i = 0; i<size; i++){
            result = result + arr[i] + '\t';
        }
        result+='\n';
        return result;
    }
}
