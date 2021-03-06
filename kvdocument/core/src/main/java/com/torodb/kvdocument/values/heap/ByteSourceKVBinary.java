/*
 *     This file is part of ToroDB.
 *
 *     ToroDB is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     ToroDB is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with ToroDB. If not, see <http://www.gnu.org/licenses/>.
 *
 *     Copyright (c) 2014, 8Kdata Technology
 *     
 */


package com.torodb.kvdocument.values.heap;

import com.google.common.io.ByteSource;
import com.torodb.kvdocument.values.KVBinary;
import com.torodb.kvdocument.values.utils.NonIOByteSource;

/**
 *
 */
public class ByteSourceKVBinary extends KVBinary {

    private static final long serialVersionUID = 1856319675637762928L;

    private final KVBinarySubtype subtype;
    private final NonIOByteSource byteSource;
    private final byte category;

    public ByteSourceKVBinary(KVBinarySubtype subtype, byte category, NonIOByteSource byteSource) {
        this.subtype = subtype;
        this.byteSource = byteSource;
        this.category = category;
    }

    public ByteSourceKVBinary(KVBinarySubtype subtype, byte category, ByteSource byteSource) {
        this(subtype, category, new NonIOByteSource(byteSource));
    }

    @Override
    public NonIOByteSource getByteSource() {
        return byteSource;
    }

    @Override
    public KVBinarySubtype getSubtype() {
        return subtype;
    }

    @Override
    public byte getCategory() {
        return category;
    }

}
