/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.intuit.craft.streaming.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Message_facts extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8275273112197171140L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message_facts\",\"namespace\":\"Signup\",\"fields\":[{\"name\":\"quantity\",\"type\":\"int\",\"doc\":\"Quantity\"},{\"name\":\"product_price\",\"type\":\"double\",\"doc\":\"Product price\"},{\"name\":\"currency\",\"type\":\"string\",\"doc\":\"Currency\"},{\"name\":\"execution_ts\",\"type\":\"long\",\"doc\":\"Execution timestamp\"},{\"name\":\"expiration_ts\",\"type\":\"long\",\"doc\":\"Expiration timestamp\"},{\"name\":\"credit_card_type\",\"type\":\"string\",\"doc\":\"Credit card type\"},{\"name\":\"company_email\",\"type\":\"string\",\"doc\":\"Company email ID\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Quantity */
  @Deprecated public int quantity;
  /** Product price */
  @Deprecated public double product_price;
  /** Currency */
  @Deprecated public java.lang.CharSequence currency;
  /** Execution timestamp */
  @Deprecated public long execution_ts;
  /** Expiration timestamp */
  @Deprecated public long expiration_ts;
  /** Credit card type */
  @Deprecated public java.lang.CharSequence credit_card_type;
  /** Company email ID */
  @Deprecated public java.lang.CharSequence company_email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Message_facts() {}

  /**
   * All-args constructor.
   * @param quantity Quantity
   * @param product_price Product price
   * @param currency Currency
   * @param execution_ts Execution timestamp
   * @param expiration_ts Expiration timestamp
   * @param credit_card_type Credit card type
   * @param company_email Company email ID
   */
  public Message_facts(java.lang.Integer quantity, java.lang.Double product_price, java.lang.CharSequence currency, java.lang.Long execution_ts, java.lang.Long expiration_ts, java.lang.CharSequence credit_card_type, java.lang.CharSequence company_email) {
    this.quantity = quantity;
    this.product_price = product_price;
    this.currency = currency;
    this.execution_ts = execution_ts;
    this.expiration_ts = expiration_ts;
    this.credit_card_type = credit_card_type;
    this.company_email = company_email;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return quantity;
    case 1: return product_price;
    case 2: return currency;
    case 3: return execution_ts;
    case 4: return expiration_ts;
    case 5: return credit_card_type;
    case 6: return company_email;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: quantity = (java.lang.Integer)value$; break;
    case 1: product_price = (java.lang.Double)value$; break;
    case 2: currency = (java.lang.CharSequence)value$; break;
    case 3: execution_ts = (java.lang.Long)value$; break;
    case 4: expiration_ts = (java.lang.Long)value$; break;
    case 5: credit_card_type = (java.lang.CharSequence)value$; break;
    case 6: company_email = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return Quantity
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the 'quantity' field.
   * Quantity
   * @param value the value to set.
   */
  public void setQuantity(java.lang.Integer value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'product_price' field.
   * @return Product price
   */
  public java.lang.Double getProductPrice() {
    return product_price;
  }

  /**
   * Sets the value of the 'product_price' field.
   * Product price
   * @param value the value to set.
   */
  public void setProductPrice(java.lang.Double value) {
    this.product_price = value;
  }

  /**
   * Gets the value of the 'currency' field.
   * @return Currency
   */
  public java.lang.CharSequence getCurrency() {
    return currency;
  }

  /**
   * Sets the value of the 'currency' field.
   * Currency
   * @param value the value to set.
   */
  public void setCurrency(java.lang.CharSequence value) {
    this.currency = value;
  }

  /**
   * Gets the value of the 'execution_ts' field.
   * @return Execution timestamp
   */
  public java.lang.Long getExecutionTs() {
    return execution_ts;
  }

  /**
   * Sets the value of the 'execution_ts' field.
   * Execution timestamp
   * @param value the value to set.
   */
  public void setExecutionTs(java.lang.Long value) {
    this.execution_ts = value;
  }

  /**
   * Gets the value of the 'expiration_ts' field.
   * @return Expiration timestamp
   */
  public java.lang.Long getExpirationTs() {
    return expiration_ts;
  }

  /**
   * Sets the value of the 'expiration_ts' field.
   * Expiration timestamp
   * @param value the value to set.
   */
  public void setExpirationTs(java.lang.Long value) {
    this.expiration_ts = value;
  }

  /**
   * Gets the value of the 'credit_card_type' field.
   * @return Credit card type
   */
  public java.lang.CharSequence getCreditCardType() {
    return credit_card_type;
  }

  /**
   * Sets the value of the 'credit_card_type' field.
   * Credit card type
   * @param value the value to set.
   */
  public void setCreditCardType(java.lang.CharSequence value) {
    this.credit_card_type = value;
  }

  /**
   * Gets the value of the 'company_email' field.
   * @return Company email ID
   */
  public java.lang.CharSequence getCompanyEmail() {
    return company_email;
  }

  /**
   * Sets the value of the 'company_email' field.
   * Company email ID
   * @param value the value to set.
   */
  public void setCompanyEmail(java.lang.CharSequence value) {
    this.company_email = value;
  }

  /**
   * Creates a new Message_facts RecordBuilder.
   * @return A new Message_facts RecordBuilder
   */
  public static com.intuit.craft.streaming.avro.Message_facts.Builder newBuilder() {
    return new com.intuit.craft.streaming.avro.Message_facts.Builder();
  }

  /**
   * Creates a new Message_facts RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Message_facts RecordBuilder
   */
  public static com.intuit.craft.streaming.avro.Message_facts.Builder newBuilder(com.intuit.craft.streaming.avro.Message_facts.Builder other) {
    return new com.intuit.craft.streaming.avro.Message_facts.Builder(other);
  }

  /**
   * Creates a new Message_facts RecordBuilder by copying an existing Message_facts instance.
   * @param other The existing instance to copy.
   * @return A new Message_facts RecordBuilder
   */
  public static com.intuit.craft.streaming.avro.Message_facts.Builder newBuilder(com.intuit.craft.streaming.avro.Message_facts other) {
    return new com.intuit.craft.streaming.avro.Message_facts.Builder(other);
  }

  /**
   * RecordBuilder for Message_facts instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message_facts>
    implements org.apache.avro.data.RecordBuilder<Message_facts> {

    /** Quantity */
    private int quantity;
    /** Product price */
    private double product_price;
    /** Currency */
    private java.lang.CharSequence currency;
    /** Execution timestamp */
    private long execution_ts;
    /** Expiration timestamp */
    private long expiration_ts;
    /** Credit card type */
    private java.lang.CharSequence credit_card_type;
    /** Company email ID */
    private java.lang.CharSequence company_email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.intuit.craft.streaming.avro.Message_facts.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.quantity)) {
        this.quantity = data().deepCopy(fields()[0].schema(), other.quantity);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product_price)) {
        this.product_price = data().deepCopy(fields()[1].schema(), other.product_price);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.currency)) {
        this.currency = data().deepCopy(fields()[2].schema(), other.currency);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.execution_ts)) {
        this.execution_ts = data().deepCopy(fields()[3].schema(), other.execution_ts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expiration_ts)) {
        this.expiration_ts = data().deepCopy(fields()[4].schema(), other.expiration_ts);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.credit_card_type)) {
        this.credit_card_type = data().deepCopy(fields()[5].schema(), other.credit_card_type);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.company_email)) {
        this.company_email = data().deepCopy(fields()[6].schema(), other.company_email);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Message_facts instance
     * @param other The existing instance to copy.
     */
    private Builder(com.intuit.craft.streaming.avro.Message_facts other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.quantity)) {
        this.quantity = data().deepCopy(fields()[0].schema(), other.quantity);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product_price)) {
        this.product_price = data().deepCopy(fields()[1].schema(), other.product_price);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.currency)) {
        this.currency = data().deepCopy(fields()[2].schema(), other.currency);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.execution_ts)) {
        this.execution_ts = data().deepCopy(fields()[3].schema(), other.execution_ts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expiration_ts)) {
        this.expiration_ts = data().deepCopy(fields()[4].schema(), other.expiration_ts);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.credit_card_type)) {
        this.credit_card_type = data().deepCopy(fields()[5].schema(), other.credit_card_type);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.company_email)) {
        this.company_email = data().deepCopy(fields()[6].schema(), other.company_email);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'quantity' field.
      * Quantity
      * @return The value.
      */
    public java.lang.Integer getQuantity() {
      return quantity;
    }

    /**
      * Sets the value of the 'quantity' field.
      * Quantity
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder setQuantity(int value) {
      validate(fields()[0], value);
      this.quantity = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * Quantity
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'quantity' field.
      * Quantity
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder clearQuantity() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'product_price' field.
      * Product price
      * @return The value.
      */
    public java.lang.Double getProductPrice() {
      return product_price;
    }

    /**
      * Sets the value of the 'product_price' field.
      * Product price
      * @param value The value of 'product_price'.
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder setProductPrice(double value) {
      validate(fields()[1], value);
      this.product_price = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'product_price' field has been set.
      * Product price
      * @return True if the 'product_price' field has been set, false otherwise.
      */
    public boolean hasProductPrice() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'product_price' field.
      * Product price
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder clearProductPrice() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'currency' field.
      * Currency
      * @return The value.
      */
    public java.lang.CharSequence getCurrency() {
      return currency;
    }

    /**
      * Sets the value of the 'currency' field.
      * Currency
      * @param value The value of 'currency'.
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder setCurrency(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.currency = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'currency' field has been set.
      * Currency
      * @return True if the 'currency' field has been set, false otherwise.
      */
    public boolean hasCurrency() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'currency' field.
      * Currency
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder clearCurrency() {
      currency = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'execution_ts' field.
      * Execution timestamp
      * @return The value.
      */
    public java.lang.Long getExecutionTs() {
      return execution_ts;
    }

    /**
      * Sets the value of the 'execution_ts' field.
      * Execution timestamp
      * @param value The value of 'execution_ts'.
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder setExecutionTs(long value) {
      validate(fields()[3], value);
      this.execution_ts = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'execution_ts' field has been set.
      * Execution timestamp
      * @return True if the 'execution_ts' field has been set, false otherwise.
      */
    public boolean hasExecutionTs() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'execution_ts' field.
      * Execution timestamp
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder clearExecutionTs() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'expiration_ts' field.
      * Expiration timestamp
      * @return The value.
      */
    public java.lang.Long getExpirationTs() {
      return expiration_ts;
    }

    /**
      * Sets the value of the 'expiration_ts' field.
      * Expiration timestamp
      * @param value The value of 'expiration_ts'.
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder setExpirationTs(long value) {
      validate(fields()[4], value);
      this.expiration_ts = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'expiration_ts' field has been set.
      * Expiration timestamp
      * @return True if the 'expiration_ts' field has been set, false otherwise.
      */
    public boolean hasExpirationTs() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'expiration_ts' field.
      * Expiration timestamp
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder clearExpirationTs() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'credit_card_type' field.
      * Credit card type
      * @return The value.
      */
    public java.lang.CharSequence getCreditCardType() {
      return credit_card_type;
    }

    /**
      * Sets the value of the 'credit_card_type' field.
      * Credit card type
      * @param value The value of 'credit_card_type'.
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder setCreditCardType(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.credit_card_type = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'credit_card_type' field has been set.
      * Credit card type
      * @return True if the 'credit_card_type' field has been set, false otherwise.
      */
    public boolean hasCreditCardType() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'credit_card_type' field.
      * Credit card type
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder clearCreditCardType() {
      credit_card_type = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'company_email' field.
      * Company email ID
      * @return The value.
      */
    public java.lang.CharSequence getCompanyEmail() {
      return company_email;
    }

    /**
      * Sets the value of the 'company_email' field.
      * Company email ID
      * @param value The value of 'company_email'.
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder setCompanyEmail(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.company_email = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'company_email' field has been set.
      * Company email ID
      * @return True if the 'company_email' field has been set, false otherwise.
      */
    public boolean hasCompanyEmail() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'company_email' field.
      * Company email ID
      * @return This builder.
      */
    public com.intuit.craft.streaming.avro.Message_facts.Builder clearCompanyEmail() {
      company_email = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Message_facts build() {
      try {
        Message_facts record = new Message_facts();
        record.quantity = fieldSetFlags()[0] ? this.quantity : (java.lang.Integer) defaultValue(fields()[0]);
        record.product_price = fieldSetFlags()[1] ? this.product_price : (java.lang.Double) defaultValue(fields()[1]);
        record.currency = fieldSetFlags()[2] ? this.currency : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.execution_ts = fieldSetFlags()[3] ? this.execution_ts : (java.lang.Long) defaultValue(fields()[3]);
        record.expiration_ts = fieldSetFlags()[4] ? this.expiration_ts : (java.lang.Long) defaultValue(fields()[4]);
        record.credit_card_type = fieldSetFlags()[5] ? this.credit_card_type : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.company_email = fieldSetFlags()[6] ? this.company_email : (java.lang.CharSequence) defaultValue(fields()[6]);
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
