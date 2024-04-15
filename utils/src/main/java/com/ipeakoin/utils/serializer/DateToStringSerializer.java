package com.ipeakoin.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateToStringSerializer
 *
 * @author klover
 * @date 2024/4/15 16:38
 */
public class DateToStringSerializer extends DateSerializer {
    /**
     * Default instance that is used when no contextual configuration
     * is needed.
     */
    public static final DateToStringSerializer instance = new DateToStringSerializer();

    public DateToStringSerializer() {
        this(null);
    }

    public DateToStringSerializer(DateFormat customFormat) {
        super(true, customFormat);
    }

    @Override
    public void serialize(Date value, JsonGenerator g, SerializerProvider provider) throws IOException {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(value);
        g.writeString(format);
    }
}
