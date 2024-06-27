package ss16.thuc_hanh_test.test_file_class;

import java.io.DataOutputStream;

import java.io.FileOutputStream;

public class TestDataOutputStream {
    public static void main(String args[] ) {
        int arr[] = {1,2,3,4,5,6,7};
        try{
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);
            for(int i=0;i<arr.length;i++){
                dout.writeInt(arr[i]);
            }
            dout.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
