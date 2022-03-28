public class MyStringBuffer {
    char[] array;
    public MyStringBuffer(){

    }
    public MyStringBuffer(String s) {
        this.array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            this.array[i] = s.charAt(i);
        }
    }
    public void print(){
         for(int i = 0; i<array.length; i++)
        System.out.print(array[i]);
    }
    public int indexOf (char c)
    {
        for(int i = 1; i<array.length; i++)
        {
            if (array[i]== c)
                return i;

        }
        return -1;
    }
    public int length(){
        return array.length;
    }
    public void erase(int index, int length) {
//Extra: Check that index must be >0 and < str.length
        if (!(index >= 0 && index < array.length)) {
            System.out.println("Couldn't erase index is incorrect");
            return;
        }

        char[] str2;

        if (index + length >= array.length) {
            str2 = new char[index];
            for (int i = 0; i < index; i++) {
                str2[i] = this.array[i];
            }

        } else {
            str2 = new char[this.array.length - length];
            int j = 0;
            for (int i = 0; i < index; i++) {
                str2[j++] = this.array[i];
            }
            for (int i = index + length; i < array.length; i++) {
                str2[j++] = this.array[i];
            }
        }
        this.array = str2;
    }
    public void insert(int index, String str) {
//Extra: Check that index must be >0 and < str.length
        if (!(index >= 0 && index < this.array.length)) {
//this should raise an error(Exception : we will know that later)
            System.out.println("Couldn't insert index is incorrect");
            return;
        }

        char[] str2 = new char[this.array.length + str.length()];
        int j = 0;
        for (int i = 0; i < index; i++) {
            str2[j++] = this.array[i];
        }
        for (int i = 0; i < str.length(); i++) {
            str2[j++] = str.charAt(i);
        }
        for (int i = index; i < this.array.length; i++) {
            str2[j++] = this.array[i];
        }

        this.array = str2;
    }
}





