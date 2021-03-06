package com.mycompany.report;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MeasureFact implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long facilityId;
   private java.lang.Long encounterId;
   private java.lang.Long userId;
   private java.lang.String measureType;
   private java.lang.Boolean measuremet;

   public MeasureFact()
   {
   }

   public java.lang.Long getFacilityId()
   {
      return this.facilityId;
   }

   public void setFacilityId(java.lang.Long facilityId)
   {
      this.facilityId = facilityId;
   }

   public java.lang.Long getEncounterId()
   {
      return this.encounterId;
   }

   public void setEncounterId(java.lang.Long encounterId)
   {
      this.encounterId = encounterId;
   }

   public java.lang.Long getUserId()
   {
      return this.userId;
   }

   public void setUserId(java.lang.Long userId)
   {
      this.userId = userId;
   }

   public java.lang.String getMeasureType()
   {
      return this.measureType;
   }

   public void setMeasureType(java.lang.String measureType)
   {
      this.measureType = measureType;
   }

   public java.lang.Boolean getMeasuremet()
   {
      return this.measuremet;
   }

   public void setMeasuremet(java.lang.Boolean measuremet)
   {
      this.measuremet = measuremet;
   }

   public MeasureFact(java.lang.Long facilityId, java.lang.Long encounterId,
         java.lang.Long userId, java.lang.String measureType,
         java.lang.Boolean measuremet)
   {
      this.facilityId = facilityId;
      this.encounterId = encounterId;
      this.userId = userId;
      this.measureType = measureType;
      this.measuremet = measuremet;
   }

   @Override
   public String toString() {
      return "MeasureFact{" +
              "facilityId=" + facilityId +
              ", encounterId=" + encounterId +
              ", userId=" + userId +
              ", measureType='" + measureType + '\'' +
              ", measuremet=" + measuremet +
              '}';
   }
}