public class BloodData {
    public enum BloodType {O, A, B, AB}

    private BloodType bloodType;
    private String rhFactor;
    public BloodData() {
        this.bloodType = BloodType.O;
        this.rhFactor = String.valueOf('+');
    }
    public BloodData(BloodType bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}
