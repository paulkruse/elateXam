//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.14 at 01:57:08 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class MappingSubTaskDefImpl
    extends de.thorstenberger.taskmodel.complex.jaxb.impl.MappingSubTaskDefTypeImpl
    implements de.thorstenberger.taskmodel.complex.jaxb.MappingSubTaskDef, java.io.Serializable, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.MappingSubTaskDef.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://complex.taskmodel.thorstenberger.de/complexTaskDef";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "mappingSubTaskDef";
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.MappingSubTaskDefImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "mappingSubTaskDef");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (de.thorstenberger.taskmodel.complex.jaxb.MappingSubTaskDef.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0016\u00ee\u00e1{p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0016\u00ee\u00e1pppsq\u0000~\u0000\u0007\u0013H\n\u00deppsq\u0000~\u0000\u0007\u0010\u0002\u0000\u0013ppsq\u0000~\u0000\u0007\u000e\u00ac\u00cc\u00d4ppsq\u0000~\u0000\u0007\u000b5l\u0081ppsq\u0000~"
+"\u0000\u0007\u0007\u00f7Z^ppsq\u0000~\u0000\u0000\u0003\u00eb2-pp\u0000sq\u0000~\u0000\u0007\u0003\u00eb2\"ppsr\u0000\u001bcom.sun.msv.grammar.Dat"
+"aExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exc"
+"eptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004\u0001~\u0084jsr\u0000"
+"\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000#com.sun.msv.dat"
+"atype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.m"
+"sv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv."
+"datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype"
+".xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/S"
+"tring;L\u0000\btypeNameq\u0000~\u0000\u001bL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/"
+"xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchem"
+"at\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$P"
+"reserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpacePro"
+"cessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullS"
+"etExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.util."
+"StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxp"
+"q\u0000~\u0000\u001fq\u0000~\u0000\u001esr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b"
+"\u0002l\u00ad\u00b3ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq"
+"\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0002l\u00ad\u00a8q\u0000~\u0000\u0016psq\u0000~\u0000\u0011\u0001\u00d8o\u00e3ppsr\u0000\"com.sun"
+".msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\u0005QNamesr\u0000"
+"5com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000!q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000.q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.Simp"
+"leNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bx"
+"r\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http:"
+"//www.w3.org/2001/XMLSchema-instancesr\u00000com.sun.msv.grammar."
+"Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tsq\u0000~\u0000\u0015\u0001psq\u0000"
+"~\u00002t\u0000\u0007problemt\u00009http://complex.taskmodel.thorstenberger.de/c"
+"omplexTaskDefsq\u0000~\u0000\'\u0004\f(,ppsq\u0000~\u0000\u0000\u0004\f(!q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007\u0004\f(\u0016ppq\u0000~\u0000\u0014s"
+"q\u0000~\u0000\'\u0002\u008d\u00a3\u00a7ppsq\u0000~\u0000)\u0002\u008d\u00a3\u009cq\u0000~\u0000\u0016pq\u0000~\u0000+sq\u0000~\u00002q\u0000~\u00005q\u0000~\u00006q\u0000~\u00008sq\u0000~\u00002t"
+"\u0000\u0004hintq\u0000~\u0000<q\u0000~\u00008sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000"
+"~\u0000\u0004\u0003>\u0012\u001eppsq\u0000~\u0000\u0000\u0003>\u0012\u001bpp\u0000sq\u0000~\u0000\u0007\u0003>\u0012\u0010ppsq\u0000~\u0000\u0000\u000119(pp\u0000sq\u0000~\u0000\'\u000119\u001dpps"
+"q\u0000~\u0000E\u000119\u0012q\u0000~\u0000\u0016psq\u0000~\u0000)\u000119\u000fq\u0000~\u0000\u0016psr\u00002com.sun.msv.grammar.Expre"
+"ssion$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bq\u0000~\u00009q\u0000~\u0000Osr\u0000 "
+"com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008sq\u0000~\u00002"
+"t\u0000Jde.thorstenberger.taskmodel.complex.jaxb.MappingSubTaskDe"
+"fType.ConceptTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-eleme"
+"ntssq\u0000~\u0000\'\u0002\f\u00d8\u00e3ppsq\u0000~\u0000)\u0002\f\u00d8\u00d8q\u0000~\u0000\u0016pq\u0000~\u0000+sq\u0000~\u00002q\u0000~\u00005q\u0000~\u00006q\u0000~\u00008sq\u0000"
+"~\u00002t\u0000\u0007conceptq\u0000~\u0000<sq\u0000~\u0000E\u0003w`Nppsq\u0000~\u0000\u0000\u0003w`Kpp\u0000sq\u0000~\u0000\u0007\u0003w`@ppsq\u0000~\u0000"
+"\u0000\u000119(pp\u0000sq\u0000~\u0000\'\u000119\u001dppsq\u0000~\u0000E\u000119\u0012q\u0000~\u0000\u0016psq\u0000~\u0000)\u000119\u000fq\u0000~\u0000\u0016pq\u0000~\u0000Oq\u0000~"
+"\u0000Qq\u0000~\u00008sq\u0000~\u00002t\u0000Mde.thorstenberger.taskmodel.complex.jaxb.Map"
+"pingSubTaskDefType.AssignmentTypeq\u0000~\u0000Tsq\u0000~\u0000\'\u0002F\'\u0013ppsq\u0000~\u0000)\u0002F\'\b"
+"q\u0000~\u0000\u0016pq\u0000~\u0000+sq\u0000~\u00002q\u0000~\u00005q\u0000~\u00006q\u0000~\u00008sq\u0000~\u00002t\u0000\nassignmentq\u0000~\u0000<sq\u0000~"
+"\u0000\'\u0001U3:ppsq\u0000~\u0000)\u0001U3/q\u0000~\u0000\u0016psq\u0000~\u0000\u0011\u0000\u009e\\\u0083ppsr\u0000$com.sun.msv.datatype"
+".xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\u0007booleanq\u0000~\u00000q\u0000~\u0000$sq"
+"\u0000~\u0000%q\u0000~\u0000mq\u0000~\u0000\u001esq\u0000~\u00002t\u0000\u0005trasht\u0000\u0000q\u0000~\u00008sq\u0000~\u0000)\u0003F\n\u00c6ppq\u0000~\u0000\u0014sq\u0000~\u00002t"
+"\u0000\u0002idq\u0000~\u0000qsq\u0000~\u0000\'\u0003\u00a6\u00d6\u008dppsq\u0000~\u0000)\u0003\u00a6\u00d6\u0082q\u0000~\u0000\u0016pq\u0000~\u0000+sq\u0000~\u00002q\u0000~\u00005q\u0000~\u00006q\u0000"
+"~\u00008sq\u0000~\u00002t\u0000\u0011mappingSubTaskDefq\u0000~\u0000<sr\u0000\"com.sun.msv.grammar.Ex"
+"pressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Ex"
+"pressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expression"
+"Pool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000{"
+"[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0017\u0000\u0000\u00009pur\u0000!["
+"Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppq\u0000~\u0000\tppp"
+"q\u0000~\u0000uppppppppppppppppppppppq\u0000~\u0000Ipppppppppppq\u0000~\u0000Lq\u0000~\u0000_q\u0000~\u0000Gpp"
+"ppppppq\u0000~\u0000Kq\u0000~\u0000^ppppppppppppppppppppppppppppppppq\u0000~\u0000cppq\u0000~\u0000("
+"pq\u0000~\u0000?pppppppppppppppppq\u0000~\u0000\u000bpppq\u0000~\u0000=ppppppppppq\u0000~\u0000\u000eppppppppp"
+"pppq\u0000~\u0000hpppppppppppppq\u0000~\u0000Upppq\u0000~\u0000\\pq\u0000~\u0000\fpppppppppppq\u0000~\u0000Zpppq"
+"\u0000~\u0000\rpppppppq\u0000~\u0000\npppq\u0000~\u0000\u0010q\u0000~\u0000@ppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return de.thorstenberger.taskmodel.complex.jaxb.impl.MappingSubTaskDefImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("mappingSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "trash");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("mappingSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "trash");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("trash" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.MappingSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.MappingSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.MappingSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.MappingSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "trash");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "trash");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
