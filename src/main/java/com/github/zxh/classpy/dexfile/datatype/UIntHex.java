package com.github.zxh.classpy.dexfile.datatype;

/**
 *
 * @author zxh
 */
public class UIntHex extends UInt {

    @Override
    protected void describe(int value) {
        setDesc("0x" + Integer.toHexString(value));
    }
    
}
