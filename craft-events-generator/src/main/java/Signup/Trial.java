/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Signup;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Trial extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7201539581180315530L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Trial\",\"namespace\":\"Signup\",\"fields\":[{\"name\":\"country\",\"type\":\"string\"},{\"name\":\"event_timestamp\",\"type\":\"long\"},{\"name\":\"company_id\",\"type\":\"string\"},{\"name\":\"Message_dims\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Message_dims\",\"fields\":[{\"name\":\"channel\",\"type\":\"string\",\"doc\":\"Channel from where the event has been generated.\"},{\"name\":\"item\",\"type\":\"string\",\"doc\":\"The Intuit item for which the event has been generated.\"}]}],\"doc\":\"Message dimensions for the event.\",\"default\":null},{\"name\":\"Message_facts\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Message_facts\",\"fields\":[{\"name\":\"quantity\",\"type\":\"int\",\"doc\":\"Quantity\"},{\"name\":\"product_price\",\"type\":\"double\",\"doc\":\"Product price\"},{\"name\":\"currency\",\"type\":\"string\",\"doc\":\"Currency\"},{\"name\":\"execution_ts\",\"type\":\"long\",\"doc\":\"Execution timestamp\"},{\"name\":\"expiration_ts\",\"type\":\"long\",\"doc\":\"Expiration timestamp\"},{\"name\":\"credit_card_type\",\"type\":\"string\",\"doc\":\"Credit card type\"},{\"name\":\"company_email\",\"type\":\"string\",\"doc\":\"Company email ID\"}]}],\"doc\":\"Message facts for the event.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence country;
  @Deprecated public long event_timestamp;
  @Deprecated public java.lang.CharSequence company_id;
  /** Message dimensions for the event. */
  @Deprecated public Signup.Message_dims Message_dims;
  /** Message facts for the event. */
  @Deprecated public Signup.Message_facts Message_facts;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Trial() {}

  /**
   * All-args constructor.
   * @param country The new value for country
   * @param event_timestamp The new value for event_timestamp
   * @param company_id The new value for company_id
   * @param Message_dims Message dimensions for the event.
   * @param Message_facts Message facts for the event.
   */
  public Trial(java.lang.CharSequence country, java.lang.Long event_timestamp, java.lang.CharSequence company_id, Signup.Message_dims Message_dims, Signup.Message_facts Message_facts) {
    this.country = country;
    this.event_timestamp = event_timestamp;
    this.company_id = company_id;
    this.Message_dims = Message_dims;
    this.Message_facts = Message_facts;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return country;
    case 1: return event_timestamp;
    case 2: return company_id;
    case 3: return Message_dims;
    case 4: return Message_facts;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: country = (java.lang.CharSequence)value$; break;
    case 1: event_timestamp = (java.lang.Long)value$; break;
    case 2: company_id = (java.lang.CharSequence)value$; break;
    case 3: Message_dims = (Signup.Message_dims)value$; break;
    case 4: Message_facts = (Signup.Message_facts)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.CharSequence getCountry() {
    return country;
  }

  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(java.lang.CharSequence value) {
    this.country = value;
  }

  /**
   * Gets the value of the 'event_timestamp' field.
   * @return The value of the 'event_timestamp' field.
   */
  public java.lang.Long getEventTimestamp() {
    return event_timestamp;
  }

  /**
   * Sets the value of the 'event_timestamp' field.
   * @param value the value to set.
   */
  public void setEventTimestamp(java.lang.Long value) {
    this.event_timestamp = value;
  }

  /**
   * Gets the value of the 'company_id' field.
   * @return The value of the 'company_id' field.
   */
  public java.lang.CharSequence getCompanyId() {
    return company_id;
  }

  /**
   * Sets the value of the 'company_id' field.
   * @param value the value to set.
   */
  public void setCompanyId(java.lang.CharSequence value) {
    this.company_id = value;
  }

  /**
   * Gets the value of the 'Message_dims' field.
   * @return Message dimensions for the event.
   */
  public Signup.Message_dims getMessageDims() {
    return Message_dims;
  }

  /**
   * Sets the value of the 'Message_dims' field.
   * Message dimensions for the event.
   * @param value the value to set.
   */
  public void setMessageDims(Signup.Message_dims value) {
    this.Message_dims = value;
  }

  /**
   * Gets the value of the 'Message_facts' field.
   * @return Message facts for the event.
   */
  public Signup.Message_facts getMessageFacts() {
    return Message_facts;
  }

  /**
   * Sets the value of the 'Message_facts' field.
   * Message facts for the event.
   * @param value the value to set.
   */
  public void setMessageFacts(Signup.Message_facts value) {
    this.Message_facts = value;
  }

  /**
   * Creates a new Trial RecordBuilder.
   * @return A new Trial RecordBuilder
   */
  public static Signup.Trial.Builder newBuilder() {
    return new Signup.Trial.Builder();
  }

  /**
   * Creates a new Trial RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Trial RecordBuilder
   */
  public static Signup.Trial.Builder newBuilder(Signup.Trial.Builder other) {
    return new Signup.Trial.Builder(other);
  }

  /**
   * Creates a new Trial RecordBuilder by copying an existing Trial instance.
   * @param other The existing instance to copy.
   * @return A new Trial RecordBuilder
   */
  public static Signup.Trial.Builder newBuilder(Signup.Trial other) {
    return new Signup.Trial.Builder(other);
  }

  /**
   * RecordBuilder for Trial instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Trial>
    implements org.apache.avro.data.RecordBuilder<Trial> {

    private java.lang.CharSequence country;
    private long event_timestamp;
    private java.lang.CharSequence company_id;
    /** Message dimensions for the event. */
    private Signup.Message_dims Message_dims;
    private Signup.Message_dims.Builder Message_dimsBuilder;
    /** Message facts for the event. */
    private Signup.Message_facts Message_facts;
    private Signup.Message_facts.Builder Message_factsBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Signup.Trial.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.country)) {
        this.country = data().deepCopy(fields()[0].schema(), other.country);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event_timestamp)) {
        this.event_timestamp = data().deepCopy(fields()[1].schema(), other.event_timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.company_id)) {
        this.company_id = data().deepCopy(fields()[2].schema(), other.company_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Message_dims)) {
        this.Message_dims = data().deepCopy(fields()[3].schema(), other.Message_dims);
        fieldSetFlags()[3] = true;
      }
      if (other.hasMessageDimsBuilder()) {
        this.Message_dimsBuilder = Signup.Message_dims.newBuilder(other.getMessageDimsBuilder());
      }
      if (isValidValue(fields()[4], other.Message_facts)) {
        this.Message_facts = data().deepCopy(fields()[4].schema(), other.Message_facts);
        fieldSetFlags()[4] = true;
      }
      if (other.hasMessageFactsBuilder()) {
        this.Message_factsBuilder = Signup.Message_facts.newBuilder(other.getMessageFactsBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Trial instance
     * @param other The existing instance to copy.
     */
    private Builder(Signup.Trial other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.country)) {
        this.country = data().deepCopy(fields()[0].schema(), other.country);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event_timestamp)) {
        this.event_timestamp = data().deepCopy(fields()[1].schema(), other.event_timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.company_id)) {
        this.company_id = data().deepCopy(fields()[2].schema(), other.company_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Message_dims)) {
        this.Message_dims = data().deepCopy(fields()[3].schema(), other.Message_dims);
        fieldSetFlags()[3] = true;
      }
      this.Message_dimsBuilder = null;
      if (isValidValue(fields()[4], other.Message_facts)) {
        this.Message_facts = data().deepCopy(fields()[4].schema(), other.Message_facts);
        fieldSetFlags()[4] = true;
      }
      this.Message_factsBuilder = null;
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.CharSequence getCountry() {
      return country;
    }

    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public Signup.Trial.Builder setCountry(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.country = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public Signup.Trial.Builder clearCountry() {
      country = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'event_timestamp' field.
      * @return The value.
      */
    public java.lang.Long getEventTimestamp() {
      return event_timestamp;
    }

    /**
      * Sets the value of the 'event_timestamp' field.
      * @param value The value of 'event_timestamp'.
      * @return This builder.
      */
    public Signup.Trial.Builder setEventTimestamp(long value) {
      validate(fields()[1], value);
      this.event_timestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'event_timestamp' field has been set.
      * @return True if the 'event_timestamp' field has been set, false otherwise.
      */
    public boolean hasEventTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'event_timestamp' field.
      * @return This builder.
      */
    public Signup.Trial.Builder clearEventTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'company_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getCompanyId() {
      return company_id;
    }

    /**
      * Sets the value of the 'company_id' field.
      * @param value The value of 'company_id'.
      * @return This builder.
      */
    public Signup.Trial.Builder setCompanyId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.company_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'company_id' field has been set.
      * @return True if the 'company_id' field has been set, false otherwise.
      */
    public boolean hasCompanyId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'company_id' field.
      * @return This builder.
      */
    public Signup.Trial.Builder clearCompanyId() {
      company_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Message_dims' field.
      * Message dimensions for the event.
      * @return The value.
      */
    public Signup.Message_dims getMessageDims() {
      return Message_dims;
    }

    /**
      * Sets the value of the 'Message_dims' field.
      * Message dimensions for the event.
      * @param value The value of 'Message_dims'.
      * @return This builder.
      */
    public Signup.Trial.Builder setMessageDims(Signup.Message_dims value) {
      validate(fields()[3], value);
      this.Message_dimsBuilder = null;
      this.Message_dims = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Message_dims' field has been set.
      * Message dimensions for the event.
      * @return True if the 'Message_dims' field has been set, false otherwise.
      */
    public boolean hasMessageDims() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'Message_dims' field and creates one if it doesn't exist yet.
     * Message dimensions for the event.
     * @return This builder.
     */
    public Signup.Message_dims.Builder getMessageDimsBuilder() {
      if (Message_dimsBuilder == null) {
        if (hasMessageDims()) {
          setMessageDimsBuilder(Signup.Message_dims.newBuilder(Message_dims));
        } else {
          setMessageDimsBuilder(Signup.Message_dims.newBuilder());
        }
      }
      return Message_dimsBuilder;
    }

    /**
     * Sets the Builder instance for the 'Message_dims' field
     * Message dimensions for the event.
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Signup.Trial.Builder setMessageDimsBuilder(Signup.Message_dims.Builder value) {
      clearMessageDims();
      Message_dimsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Message_dims' field has an active Builder instance
     * Message dimensions for the event.
     * @return True if the 'Message_dims' field has an active Builder instance
     */
    public boolean hasMessageDimsBuilder() {
      return Message_dimsBuilder != null;
    }

    /**
      * Clears the value of the 'Message_dims' field.
      * Message dimensions for the event.
      * @return This builder.
      */
    public Signup.Trial.Builder clearMessageDims() {
      Message_dims = null;
      Message_dimsBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'Message_facts' field.
      * Message facts for the event.
      * @return The value.
      */
    public Signup.Message_facts getMessageFacts() {
      return Message_facts;
    }

    /**
      * Sets the value of the 'Message_facts' field.
      * Message facts for the event.
      * @param value The value of 'Message_facts'.
      * @return This builder.
      */
    public Signup.Trial.Builder setMessageFacts(Signup.Message_facts value) {
      validate(fields()[4], value);
      this.Message_factsBuilder = null;
      this.Message_facts = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'Message_facts' field has been set.
      * Message facts for the event.
      * @return True if the 'Message_facts' field has been set, false otherwise.
      */
    public boolean hasMessageFacts() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'Message_facts' field and creates one if it doesn't exist yet.
     * Message facts for the event.
     * @return This builder.
     */
    public Signup.Message_facts.Builder getMessageFactsBuilder() {
      if (Message_factsBuilder == null) {
        if (hasMessageFacts()) {
          setMessageFactsBuilder(Signup.Message_facts.newBuilder(Message_facts));
        } else {
          setMessageFactsBuilder(Signup.Message_facts.newBuilder());
        }
      }
      return Message_factsBuilder;
    }

    /**
     * Sets the Builder instance for the 'Message_facts' field
     * Message facts for the event.
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Signup.Trial.Builder setMessageFactsBuilder(Signup.Message_facts.Builder value) {
      clearMessageFacts();
      Message_factsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Message_facts' field has an active Builder instance
     * Message facts for the event.
     * @return True if the 'Message_facts' field has an active Builder instance
     */
    public boolean hasMessageFactsBuilder() {
      return Message_factsBuilder != null;
    }

    /**
      * Clears the value of the 'Message_facts' field.
      * Message facts for the event.
      * @return This builder.
      */
    public Signup.Trial.Builder clearMessageFacts() {
      Message_facts = null;
      Message_factsBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Trial build() {
      try {
        Trial record = new Trial();
        record.country = fieldSetFlags()[0] ? this.country : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.event_timestamp = fieldSetFlags()[1] ? this.event_timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.company_id = fieldSetFlags()[2] ? this.company_id : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (Message_dimsBuilder != null) {
          record.Message_dims = this.Message_dimsBuilder.build();
        } else {
          record.Message_dims = fieldSetFlags()[3] ? this.Message_dims : (Signup.Message_dims) defaultValue(fields()[3]);
        }
        if (Message_factsBuilder != null) {
          record.Message_facts = this.Message_factsBuilder.build();
        } else {
          record.Message_facts = fieldSetFlags()[4] ? this.Message_facts : (Signup.Message_facts) defaultValue(fields()[4]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
