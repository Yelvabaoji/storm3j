package org.storm3j.abi.datatypes.generated;

import java.util.List;
import org.storm3j.abi.datatypes.StaticArray;
import org.storm3j.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.storm3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/storm3j/storm3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray6<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray6(List<T> values) {
        super(6, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray6(T... values) {
        super(6, values);
    }

    public StaticArray6(Class<T> type, List<T> values) {
        super(type, 6, values);
    }

    @SafeVarargs
    public StaticArray6(Class<T> type, T... values) {
        super(type, 6, values);
    }
}
