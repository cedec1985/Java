private void recopier (DataInputStream i, DataOutputStream o)
{
try{
    while(true) o.writeInt(i.readInt());
}
catch (EOFException e) {
    i.close();o.close();
}

    
