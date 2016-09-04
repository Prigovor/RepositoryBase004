package lesson02;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * Created by nucleos on 28.08.16.
 */

public class VarArgs {

    @NotNull
    public static Integer sum(Integer first, Integer second) {
        return first + second;
    }

    @NotNull
    public static Integer sum(Integer first, Integer second,
                              Integer...args) {
        if (args.length > 0) {
            int sum = first + second;
            for (Integer arg : args) {
                sum += arg;
            }
            return sum;
        } else {
            return first + second;
        }
    }

    public static Integer sum(Integer...args) {
        if (args.length > 0) {
            int sum = 0;
            for (Integer arg : args) {
                sum += arg;
            }
            return sum;
        }
        return null;
    }
}
