# Assignment 2 - Factory Method + Abstract Factory

Theme: Payment Terminal (regional card processing).

I picked this because it made sense to have a family of 
things that must match — a European card should not be 
validated by a US validator.

## Part A - Factory Method

Product: PaymentProcessor
Concrete: VisaProcessor, MastercardProcessor, KaspiProcessor
Creator: PaymentProcessorFactory (abstract, has checkout() as a business method)
Concrete creators: VisaProcessorFactory, MastercardProcessorFactory, KaspiProcessorFactory

The client (PartAMain) never calls new VisaProcessor() etc. It only
picks a factory.

## Part B - Abstract Factory

Family: Card + Receipt + Validator
Factories: USPaymentFactory, EUPaymentFactory, AsiaPaymentFactory

Client (PaymentClient) takes the factory in the constructor and only
uses the interfaces. The family is picked once in PartBMain.main().

Each family is internally consistent:
- US: signature card, sales tax receipt, zip check
- EU: pin card, VAT receipt, pin check
- Asia: QR card, tax-included receipt, QR check

If I mixed them (like an EU card with a US validator) the payment
would not make sense, which is why the whole family has to come from
the same factory.

## Factory Method vs Abstract Factory

Factory Method = one product, uses inheritance.
Abstract Factory = a family of products, uses composition.

## SOLID

Open/Closed: adding a new processor factory or a new region factory
doesn't touch client code.
Single Responsibility: creation lives in the factory classes, not
in the client.

## Drawbacks

Abstract Factory adds a lot of classes. If you only ever need one region 
it's overkill. Also, adding a new kind of product (like a RefundPolicy) 
would mean changing the abstract factory interface and every concrete 
factory. That's its weak spot.

## How to run

cd src
javac factorymethod/*.java
java factorymethod.PartAMain

javac abstractfactory/*.java
java abstractfactory.PartBDemo