package com.example.storm;

import com.example.storm.api.Entity;

@Entity
public class TestEntity extends ModelBase {
	
	private int privateField;
	transient int transientField;
	boolean booleanField;
	byte byteField;
	byte[] blobField;
	char charField;
	short shortField;
	int intField;
	long longField;
	float floatField;
	double doubleField;
	Boolean wBooleanField;
	Byte wByteField;
	Character wCharacterField;
	Short wShortField;
	Integer wIntegerField;
	Long wLongField;
	Float wFloatField;
	Double wDoubleField;
	String wStringField;
	
	public int getPrivateField() {
		return privateField;
	}
	public void setPrivateField(int privateField) {
		this.privateField = privateField;
	}
	public int getTransientField() {
		return transientField;
	}
	public void setTransientField(int transientField) {
		this.transientField = transientField;
	}
	public boolean isBooleanField() {
		return booleanField;
	}
	public void setBooleanField(boolean booleanField) {
		this.booleanField = booleanField;
	}
	public byte getByteField() {
		return byteField;
	}
	public void setByteField(byte byteField) {
		this.byteField = byteField;
	}
	public byte[] getBlobField() {
		return blobField;
	}
	public void setBlobField(byte[] blobField) {
		this.blobField = blobField;
	}
	public char getCharField() {
		return charField;
	}
	public void setCharField(char charField) {
		this.charField = charField;
	}
	public short getShortField() {
		return shortField;
	}
	public void setShortField(short tinyField) {
		this.shortField = tinyField;
	}
	public int getIntField() {
		return intField;
	}
	public void setIntField(int intField) {
		this.intField = intField;
	}
	public long getLongField() {
		return longField;
	}
	public void setLongField(long longField) {
		this.longField = longField;
	}
	public float getFloatField() {
		return floatField;
	}
	public void setFloatField(float floatField) {
		this.floatField = floatField;
	}
	public double getDoubleField() {
		return doubleField;
	}
	public void setDoubleField(double doubleField) {
		this.doubleField = doubleField;
	}
	public Boolean getwBooleanField() {
		return wBooleanField;
	}
	public void setwBooleanField(Boolean wBooleanField) {
		this.wBooleanField = wBooleanField;
	}
	public Byte getwByteField() {
		return wByteField;
	}
	public void setwByteField(Byte wByteField) {
		this.wByteField = wByteField;
	}
	public Character getwCharacterField() {
		return wCharacterField;
	}
	public void setwCharacterField(Character wCharacterField) {
		this.wCharacterField = wCharacterField;
	}
	public Short getwShortField() {
		return wShortField;
	}
	public void setwShortField(Short wShortField) {
		this.wShortField = wShortField;
	}
	public Integer getwIntegerField() {
		return wIntegerField;
	}
	public void setwIntegerField(Integer wIntegerField) {
		this.wIntegerField = wIntegerField;
	}
	public Long getwLongField() {
		return wLongField;
	}
	public void setwLongField(Long wLongField) {
		this.wLongField = wLongField;
	}
	public Float getwFloatField() {
		return wFloatField;
	}
	public void setwFloatField(Float wFloatField) {
		this.wFloatField = wFloatField;
	}
	public Double getwDoubleField() {
		return wDoubleField;
	}
	public void setwDoubleField(Double wDoubleField) {
		this.wDoubleField = wDoubleField;
	}
	public String getwStringField() {
		return wStringField;
	}
	public void setwStringField(String wStringField) {
		this.wStringField = wStringField;
	}
	
}
