/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4); 
 */

public class Solution extends Reader4 {
    
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
     char[] mybuffer = new char[4];
     int buffsize;
     int index;
     //Time Complexity:O(n)
     //Space Complexity:O(1)
    public int read(char[] buf, int n) {
        if (buffsize ==0)
        buffsize = read4(mybuffer);

        int i =0;
        while (i < n && buffsize > 0){
            buf[i++] = mybuffer[index++];
            if (index == buffsize){
                index = 0;
                buffsize = read4(mybuffer);
            }
        }
        return i;
    }
}
