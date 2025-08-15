public class Thread_life_cycle {
    public static void main(String[] args) {
        //Life Cycle of Thread:
        /*
        1)NEW--->2)RUNNABLE--->3)RUNNING--->4)NON-RUNNABLE(BLOCK)--->5)TERMINATED.
        1)New : instance of thread created which is not yet started by invoking start().
        2)RUNNABLE : after invocation of start() and before it is selected to run by the schedular.
        3)RUNNING : after thread schedular has selected it.
        4)NON-RUNNABLE(block) : thread alive , not eligible to run.
        5)TERMINATED : run() method has exited.
         */
    }
}

