import java.nio.ByteBuffer;
import java.nio.*;

public class BufferOptionsDemo {
    public static void main(String[] args) {
        //Create a ByteBuffer with capacity 10
        ByteBuffer buffer = ByteBuffer.allocate(10);

        //Fill the buffer 
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);
        buffer.put((byte) 4);

        System.out.println("Filled buffer: " + buffer);

        //Drain the buffer
        buffer.flip();
        while(buffer.hasRemaining()){
            byte value = buffer.get();
            System.out.println("Drained value: " + value);
        }
        System.out.println("Drained buffer: " + buffer);

        //Create a new ByteBuffer
        ByteBuffer originalBuffer = ByteBuffer.allocate(10);
        originalBuffer.put((byte) 1);
        originalBuffer.put((byte) 2);
        originalBuffer.put((byte) 3);
        originalBuffer.put((byte) 4);

        //Duplicate the buffer 
        ByteBuffer duplicateBuffer = originalBuffer.duplicate();

        System.out.println("Original buffer: " + originalBuffer);
        System.out.println("Original buffer: " + duplicateBuffer);

        //Slice the buffer
        duplicateBuffer.position(2);
        duplicateBuffer.limit(4);
        ByteBuffer slicedBuffer = duplicateBuffer.slice();

        System.out.println("Sliced Buffer: " + slicedBuffer);

        //compact the buffer
        slicedBuffer.compact();

        System.out.println("Compacted buffer: " + slicedBuffer);
    }
}