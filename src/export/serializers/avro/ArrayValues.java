/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package export.serializers.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ArrayValues extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8408894195144478097L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ArrayValues\",\"namespace\":\"export.serializers.avro\",\"fields\":[{\"name\":\"dataType\",\"type\":\"string\"},{\"name\":\"deviceInfo\",\"type\":{\"type\":\"record\",\"name\":\"DeviceInfo\",\"fields\":[{\"name\":\"site\",\"type\":\"string\"},{\"name\":\"service\",\"type\":\"string\"},{\"name\":\"sector\",\"type\":\"string\"},{\"name\":\"room\",\"type\":\"string\"},{\"name\":\"alias\",\"type\":\"string\"},{\"name\":\"serialPort\",\"type\":\"string\"},{\"name\":\"driver\",\"type\":\"string\"}]}},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"DataArray\",\"fields\":[{\"name\":\"frequency\",\"type\":\"float\"},{\"name\":\"rosettaCode\",\"type\":\"string\"},{\"name\":\"metricId\",\"type\":\"string\"},{\"name\":\"vendorMetricId\",\"type\":\"string\"},{\"name\":\"instanceId\",\"type\":\"int\"},{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}},{\"name\":\"timestampsNano\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ArrayValues> ENCODER =
      new BinaryMessageEncoder<ArrayValues>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ArrayValues> DECODER =
      new BinaryMessageDecoder<ArrayValues>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ArrayValues> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ArrayValues> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ArrayValues>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ArrayValues to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ArrayValues from a ByteBuffer. */
  public static ArrayValues fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence dataType;
  @Deprecated public export.serializers.avro.DeviceInfo deviceInfo;
  @Deprecated public export.serializers.avro.DataArray data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ArrayValues() {}

  /**
   * All-args constructor.
   * @param dataType The new value for dataType
   * @param deviceInfo The new value for deviceInfo
   * @param data The new value for data
   */
  public ArrayValues(java.lang.CharSequence dataType, export.serializers.avro.DeviceInfo deviceInfo, export.serializers.avro.DataArray data) {
    this.dataType = dataType;
    this.deviceInfo = deviceInfo;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dataType;
    case 1: return deviceInfo;
    case 2: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dataType = (java.lang.CharSequence)value$; break;
    case 1: deviceInfo = (export.serializers.avro.DeviceInfo)value$; break;
    case 2: data = (export.serializers.avro.DataArray)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dataType' field.
   * @return The value of the 'dataType' field.
   */
  public java.lang.CharSequence getDataType() {
    return dataType;
  }

  /**
   * Sets the value of the 'dataType' field.
   * @param value the value to set.
   */
  public void setDataType(java.lang.CharSequence value) {
    this.dataType = value;
  }

  /**
   * Gets the value of the 'deviceInfo' field.
   * @return The value of the 'deviceInfo' field.
   */
  public export.serializers.avro.DeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  /**
   * Sets the value of the 'deviceInfo' field.
   * @param value the value to set.
   */
  public void setDeviceInfo(export.serializers.avro.DeviceInfo value) {
    this.deviceInfo = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public export.serializers.avro.DataArray getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(export.serializers.avro.DataArray value) {
    this.data = value;
  }

  /**
   * Creates a new ArrayValues RecordBuilder.
   * @return A new ArrayValues RecordBuilder
   */
  public static export.serializers.avro.ArrayValues.Builder newBuilder() {
    return new export.serializers.avro.ArrayValues.Builder();
  }

  /**
   * Creates a new ArrayValues RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ArrayValues RecordBuilder
   */
  public static export.serializers.avro.ArrayValues.Builder newBuilder(export.serializers.avro.ArrayValues.Builder other) {
    return new export.serializers.avro.ArrayValues.Builder(other);
  }

  /**
   * Creates a new ArrayValues RecordBuilder by copying an existing ArrayValues instance.
   * @param other The existing instance to copy.
   * @return A new ArrayValues RecordBuilder
   */
  public static export.serializers.avro.ArrayValues.Builder newBuilder(export.serializers.avro.ArrayValues other) {
    return new export.serializers.avro.ArrayValues.Builder(other);
  }

  /**
   * RecordBuilder for ArrayValues instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ArrayValues>
    implements org.apache.avro.data.RecordBuilder<ArrayValues> {

    private java.lang.CharSequence dataType;
    private export.serializers.avro.DeviceInfo deviceInfo;
    private export.serializers.avro.DeviceInfo.Builder deviceInfoBuilder;
    private export.serializers.avro.DataArray data;
    private export.serializers.avro.DataArray.Builder dataBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(export.serializers.avro.ArrayValues.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dataType)) {
        this.dataType = data().deepCopy(fields()[0].schema(), other.dataType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deviceInfo)) {
        this.deviceInfo = data().deepCopy(fields()[1].schema(), other.deviceInfo);
        fieldSetFlags()[1] = true;
      }
      if (other.hasDeviceInfoBuilder()) {
        this.deviceInfoBuilder = export.serializers.avro.DeviceInfo.newBuilder(other.getDeviceInfoBuilder());
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
      if (other.hasDataBuilder()) {
        this.dataBuilder = export.serializers.avro.DataArray.newBuilder(other.getDataBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ArrayValues instance
     * @param other The existing instance to copy.
     */
    private Builder(export.serializers.avro.ArrayValues other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.dataType)) {
        this.dataType = data().deepCopy(fields()[0].schema(), other.dataType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deviceInfo)) {
        this.deviceInfo = data().deepCopy(fields()[1].schema(), other.deviceInfo);
        fieldSetFlags()[1] = true;
      }
      this.deviceInfoBuilder = null;
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
      this.dataBuilder = null;
    }

    /**
      * Gets the value of the 'dataType' field.
      * @return The value.
      */
    public java.lang.CharSequence getDataType() {
      return dataType;
    }

    /**
      * Sets the value of the 'dataType' field.
      * @param value The value of 'dataType'.
      * @return This builder.
      */
    public export.serializers.avro.ArrayValues.Builder setDataType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.dataType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'dataType' field has been set.
      * @return True if the 'dataType' field has been set, false otherwise.
      */
    public boolean hasDataType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'dataType' field.
      * @return This builder.
      */
    public export.serializers.avro.ArrayValues.Builder clearDataType() {
      dataType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'deviceInfo' field.
      * @return The value.
      */
    public export.serializers.avro.DeviceInfo getDeviceInfo() {
      return deviceInfo;
    }

    /**
      * Sets the value of the 'deviceInfo' field.
      * @param value The value of 'deviceInfo'.
      * @return This builder.
      */
    public export.serializers.avro.ArrayValues.Builder setDeviceInfo(export.serializers.avro.DeviceInfo value) {
      validate(fields()[1], value);
      this.deviceInfoBuilder = null;
      this.deviceInfo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'deviceInfo' field has been set.
      * @return True if the 'deviceInfo' field has been set, false otherwise.
      */
    public boolean hasDeviceInfo() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'deviceInfo' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public export.serializers.avro.DeviceInfo.Builder getDeviceInfoBuilder() {
      if (deviceInfoBuilder == null) {
        if (hasDeviceInfo()) {
          setDeviceInfoBuilder(export.serializers.avro.DeviceInfo.newBuilder(deviceInfo));
        } else {
          setDeviceInfoBuilder(export.serializers.avro.DeviceInfo.newBuilder());
        }
      }
      return deviceInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'deviceInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public export.serializers.avro.ArrayValues.Builder setDeviceInfoBuilder(export.serializers.avro.DeviceInfo.Builder value) {
      clearDeviceInfo();
      deviceInfoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'deviceInfo' field has an active Builder instance
     * @return True if the 'deviceInfo' field has an active Builder instance
     */
    public boolean hasDeviceInfoBuilder() {
      return deviceInfoBuilder != null;
    }

    /**
      * Clears the value of the 'deviceInfo' field.
      * @return This builder.
      */
    public export.serializers.avro.ArrayValues.Builder clearDeviceInfo() {
      deviceInfo = null;
      deviceInfoBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public export.serializers.avro.DataArray getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public export.serializers.avro.ArrayValues.Builder setData(export.serializers.avro.DataArray value) {
      validate(fields()[2], value);
      this.dataBuilder = null;
      this.data = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'data' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public export.serializers.avro.DataArray.Builder getDataBuilder() {
      if (dataBuilder == null) {
        if (hasData()) {
          setDataBuilder(export.serializers.avro.DataArray.newBuilder(data));
        } else {
          setDataBuilder(export.serializers.avro.DataArray.newBuilder());
        }
      }
      return dataBuilder;
    }

    /**
     * Sets the Builder instance for the 'data' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public export.serializers.avro.ArrayValues.Builder setDataBuilder(export.serializers.avro.DataArray.Builder value) {
      clearData();
      dataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'data' field has an active Builder instance
     * @return True if the 'data' field has an active Builder instance
     */
    public boolean hasDataBuilder() {
      return dataBuilder != null;
    }

    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public export.serializers.avro.ArrayValues.Builder clearData() {
      data = null;
      dataBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ArrayValues build() {
      try {
        ArrayValues record = new ArrayValues();
        record.dataType = fieldSetFlags()[0] ? this.dataType : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (deviceInfoBuilder != null) {
          record.deviceInfo = this.deviceInfoBuilder.build();
        } else {
          record.deviceInfo = fieldSetFlags()[1] ? this.deviceInfo : (export.serializers.avro.DeviceInfo) defaultValue(fields()[1]);
        }
        if (dataBuilder != null) {
          record.data = this.dataBuilder.build();
        } else {
          record.data = fieldSetFlags()[2] ? this.data : (export.serializers.avro.DataArray) defaultValue(fields()[2]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ArrayValues>
    WRITER$ = (org.apache.avro.io.DatumWriter<ArrayValues>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ArrayValues>
    READER$ = (org.apache.avro.io.DatumReader<ArrayValues>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}