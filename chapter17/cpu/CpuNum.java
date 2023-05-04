package cpu;

/**
 * @Author: EzioHe
 * @Date: 2023/5/4 20:57
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        int cpuNums= runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
