package edu.patterns.creational.builder;

public record ExampleEntityBuilder(
        long id,
        String entityName,
        String entityAddress,
        long postalCode,
        String website
) {
    public static class Builder {
        private long id = 0;
        private String entityName = "default name";
        private String entityAddress = "default address";
        private long postalCode = 0;
        private String website = "default website";

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.entityName = name;
            return this;
        }

        public Builder withAddress(String address) {
            this.entityAddress = address;
            return this;
        }

        public Builder withPostalCode(long postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder withWebsite(String website) {
            this.website = website;
            return this;
        }

        public ExampleEntityBuilder build() {
            return new ExampleEntityBuilder(id, entityName, entityAddress, postalCode, website);
        }
    }
}
