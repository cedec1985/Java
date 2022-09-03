import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


private void recopier (DataInputStream i, DataOutputStream o)
{
try{
    while(true) o.writeInt(i.readInt());
}
catch (EOFException e) {
    i.close();o.close();
}

    
