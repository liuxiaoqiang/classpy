package com.github.zxh.classpy.classfile.attribute;

import com.github.zxh.classpy.classfile.reader.ClassReader;

/*
StackMapTable_attribute {
    u2              attribute_name_index;
    u4              attribute_length;
    u2              number_of_entries;
    stack_map_frame entries[number_of_entries];
}
 */
public class StackMapTableAttribute extends AttributeInfo {

    {
        u2("number_of_entries");
    }

    @Override
    protected void readContent(ClassReader reader) {
        super.readContent(reader);
        // todo
        reader.skipBytes(super.getUInt("attribute_length") - 2);
    }

}
