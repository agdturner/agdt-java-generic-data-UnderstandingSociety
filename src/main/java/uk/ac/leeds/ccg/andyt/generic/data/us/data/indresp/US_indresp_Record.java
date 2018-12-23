/**
 * Source code generated by uk.ac.leeds.ccg.andyt.generic.data.us.process.US_JavaCodeGenerator
 */
package uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp;
import java.io.Serializable;
public class US_indresp_Record implements Serializable {
protected String[] s;
protected byte AIDHH;
protected byte AIDHRS;
protected byte AIDXHH;
protected byte CARUSE;
protected byte FEEND;
protected double FIMNGRS_DV;
protected double FIMNLABGRS_DV;
protected byte FINNOW;
protected byte GOR_DV;
protected byte HGBIOF;
protected byte HGBIOM;
protected byte HHORIG;
protected int HIDP;
protected byte HIQUAL_DV;
protected byte IENDDATHH;
protected byte ISTRTDATD;
protected byte ISTRTDATHH;
protected byte ISTRTDATM;
protected byte IVFIO;
protected byte IVPRSNT;
protected byte J2HAS;
protected short J2HRS;
protected double J2PAY_DV;
protected byte J2PAY_IF;
protected byte J2SEMP;
protected byte JBBGD;
protected byte JBBGM;
protected short JBBGY;
protected byte JBFT_DV;
protected byte JBHAD;
protected byte JBHAS;
protected double JBHRS;
protected short JBISCO88_CC;
protected byte JBMNGR;
protected byte JBNSSEC8_DV;
protected byte JBOFF;
protected byte JBOT;
protected byte JBOTPD;
protected byte JBPL;
protected byte JBSECT;
protected byte JBSEMP;
protected byte JBSIZE;
protected byte JBSTAT;
protected short JBTTWT;
protected byte JLBOSS;
protected short JLENDY;
protected short JLISCO88_CC;
protected byte JLMNGR;
protected byte JLNSSEC8_DV;
protected byte JLSEMP;
protected byte JLSIZE;
protected byte JSACCS;
protected byte JSBOSS;
protected double JSHRS;
protected byte JSPL;
protected byte JSPRBM;
protected short JSPRBY4;
protected byte JSPREM;
protected short JSPREY4;
protected int JSPRF;
protected byte JSSIZE;
protected byte JSTTWT;
protected short JSTTWTB;
protected byte JULK4WK;
protected byte JULKJB;
protected byte LKMOVE;
protected byte MEMORIG;
protected byte MLSTAT;
protected int PAYGL;
protected double PAYGU_DV;
protected byte PAYGU_IF;
protected int PAYNL;
protected double PAYNU_DV;
protected byte PAYNU_IF;
protected double PAYN_DV;
protected int PAYU;
protected byte PAYUG;
protected byte PAYUSL;
protected int PIDP;
protected byte PJULK4WK;
protected byte PLBORNC;
protected byte PNO;
protected byte PPNO;
protected byte PRIPN;
protected byte RACH16_DV;
protected byte SCEND;
protected byte SCGHQ1_DV;
protected byte SCGHQ2_DV;
protected byte SCGHQA;
protected byte SCGHQB;
protected byte SCGHQC;
protected byte SCGHQD;
protected byte SCGHQE;
protected byte SCGHQF;
protected byte SCGHQG;
protected byte SCGHQH;
protected byte SCGHQI;
protected byte SCGHQJ;
protected byte SCGHQK;
protected byte SCGHQL;
protected byte SCHOOL;
protected byte SEX;
protected short YR2UK4;
protected final void initAIDHH(String s) {
if (!s.trim().isEmpty()) {
AIDHH = Byte.parseByte(s);
} else {
AIDHH = Byte.MIN_VALUE;
}
}

protected final void initAIDHRS(String s) {
if (!s.trim().isEmpty()) {
AIDHRS = Byte.parseByte(s);
} else {
AIDHRS = Byte.MIN_VALUE;
}
}

protected final void initAIDXHH(String s) {
if (!s.trim().isEmpty()) {
AIDXHH = Byte.parseByte(s);
} else {
AIDXHH = Byte.MIN_VALUE;
}
}

protected final void initCARUSE(String s) {
if (!s.trim().isEmpty()) {
CARUSE = Byte.parseByte(s);
} else {
CARUSE = Byte.MIN_VALUE;
}
}

protected final void initFEEND(String s) {
if (!s.trim().isEmpty()) {
FEEND = Byte.parseByte(s);
} else {
FEEND = Byte.MIN_VALUE;
}
}

protected final void initFIMNGRS_DV(String s) {
if (!s.trim().isEmpty()) {
FIMNGRS_DV = Double.parseDouble(s);
} else {
FIMNGRS_DV = Double.NaN;
}
}

protected final void initFIMNLABGRS_DV(String s) {
if (!s.trim().isEmpty()) {
FIMNLABGRS_DV = Double.parseDouble(s);
} else {
FIMNLABGRS_DV = Double.NaN;
}
}

protected final void initFINNOW(String s) {
if (!s.trim().isEmpty()) {
FINNOW = Byte.parseByte(s);
} else {
FINNOW = Byte.MIN_VALUE;
}
}

protected final void initGOR_DV(String s) {
if (!s.trim().isEmpty()) {
GOR_DV = Byte.parseByte(s);
} else {
GOR_DV = Byte.MIN_VALUE;
}
}

protected final void initHGBIOF(String s) {
if (!s.trim().isEmpty()) {
HGBIOF = Byte.parseByte(s);
} else {
HGBIOF = Byte.MIN_VALUE;
}
}

protected final void initHGBIOM(String s) {
if (!s.trim().isEmpty()) {
HGBIOM = Byte.parseByte(s);
} else {
HGBIOM = Byte.MIN_VALUE;
}
}

protected final void initHHORIG(String s) {
if (!s.trim().isEmpty()) {
HHORIG = Byte.parseByte(s);
} else {
HHORIG = Byte.MIN_VALUE;
}
}

protected final void initHIDP(String s) {
if (!s.trim().isEmpty()) {
HIDP = Integer.parseInt(s);
} else {
HIDP = Integer.MIN_VALUE;
}
}

protected final void initHIQUAL_DV(String s) {
if (!s.trim().isEmpty()) {
HIQUAL_DV = Byte.parseByte(s);
} else {
HIQUAL_DV = Byte.MIN_VALUE;
}
}

protected final void initIENDDATHH(String s) {
if (!s.trim().isEmpty()) {
IENDDATHH = Byte.parseByte(s);
} else {
IENDDATHH = Byte.MIN_VALUE;
}
}

protected final void initISTRTDATD(String s) {
if (!s.trim().isEmpty()) {
ISTRTDATD = Byte.parseByte(s);
} else {
ISTRTDATD = Byte.MIN_VALUE;
}
}

protected final void initISTRTDATHH(String s) {
if (!s.trim().isEmpty()) {
ISTRTDATHH = Byte.parseByte(s);
} else {
ISTRTDATHH = Byte.MIN_VALUE;
}
}

protected final void initISTRTDATM(String s) {
if (!s.trim().isEmpty()) {
ISTRTDATM = Byte.parseByte(s);
} else {
ISTRTDATM = Byte.MIN_VALUE;
}
}

protected final void initIVFIO(String s) {
if (!s.trim().isEmpty()) {
IVFIO = Byte.parseByte(s);
} else {
IVFIO = Byte.MIN_VALUE;
}
}

protected final void initIVPRSNT(String s) {
if (!s.trim().isEmpty()) {
IVPRSNT = Byte.parseByte(s);
} else {
IVPRSNT = Byte.MIN_VALUE;
}
}

protected final void initJ2HAS(String s) {
if (!s.trim().isEmpty()) {
J2HAS = Byte.parseByte(s);
} else {
J2HAS = Byte.MIN_VALUE;
}
}

protected final void initJ2HRS(String s) {
if (!s.trim().isEmpty()) {
J2HRS = Short.parseShort(s);
} else {
J2HRS = Short.MIN_VALUE;
}
}

protected final void initJ2PAY_DV(String s) {
if (!s.trim().isEmpty()) {
J2PAY_DV = Double.parseDouble(s);
} else {
J2PAY_DV = Double.NaN;
}
}

protected final void initJ2PAY_IF(String s) {
if (!s.trim().isEmpty()) {
J2PAY_IF = Byte.parseByte(s);
} else {
J2PAY_IF = Byte.MIN_VALUE;
}
}

protected final void initJ2SEMP(String s) {
if (!s.trim().isEmpty()) {
J2SEMP = Byte.parseByte(s);
} else {
J2SEMP = Byte.MIN_VALUE;
}
}

protected final void initJBBGD(String s) {
if (!s.trim().isEmpty()) {
JBBGD = Byte.parseByte(s);
} else {
JBBGD = Byte.MIN_VALUE;
}
}

protected final void initJBBGM(String s) {
if (!s.trim().isEmpty()) {
JBBGM = Byte.parseByte(s);
} else {
JBBGM = Byte.MIN_VALUE;
}
}

protected final void initJBBGY(String s) {
if (!s.trim().isEmpty()) {
JBBGY = Short.parseShort(s);
} else {
JBBGY = Short.MIN_VALUE;
}
}

protected final void initJBFT_DV(String s) {
if (!s.trim().isEmpty()) {
JBFT_DV = Byte.parseByte(s);
} else {
JBFT_DV = Byte.MIN_VALUE;
}
}

protected final void initJBHAD(String s) {
if (!s.trim().isEmpty()) {
JBHAD = Byte.parseByte(s);
} else {
JBHAD = Byte.MIN_VALUE;
}
}

protected final void initJBHAS(String s) {
if (!s.trim().isEmpty()) {
JBHAS = Byte.parseByte(s);
} else {
JBHAS = Byte.MIN_VALUE;
}
}

protected final void initJBHRS(String s) {
if (!s.trim().isEmpty()) {
JBHRS = Double.parseDouble(s);
} else {
JBHRS = Double.NaN;
}
}

protected final void initJBISCO88_CC(String s) {
if (!s.trim().isEmpty()) {
JBISCO88_CC = Short.parseShort(s);
} else {
JBISCO88_CC = Short.MIN_VALUE;
}
}

protected final void initJBMNGR(String s) {
if (!s.trim().isEmpty()) {
JBMNGR = Byte.parseByte(s);
} else {
JBMNGR = Byte.MIN_VALUE;
}
}

protected final void initJBNSSEC8_DV(String s) {
if (!s.trim().isEmpty()) {
JBNSSEC8_DV = Byte.parseByte(s);
} else {
JBNSSEC8_DV = Byte.MIN_VALUE;
}
}

protected final void initJBOFF(String s) {
if (!s.trim().isEmpty()) {
JBOFF = Byte.parseByte(s);
} else {
JBOFF = Byte.MIN_VALUE;
}
}

protected final void initJBOT(String s) {
if (!s.trim().isEmpty()) {
JBOT = Byte.parseByte(s);
} else {
JBOT = Byte.MIN_VALUE;
}
}

protected final void initJBOTPD(String s) {
if (!s.trim().isEmpty()) {
JBOTPD = Byte.parseByte(s);
} else {
JBOTPD = Byte.MIN_VALUE;
}
}

protected final void initJBPL(String s) {
if (!s.trim().isEmpty()) {
JBPL = Byte.parseByte(s);
} else {
JBPL = Byte.MIN_VALUE;
}
}

protected final void initJBSECT(String s) {
if (!s.trim().isEmpty()) {
JBSECT = Byte.parseByte(s);
} else {
JBSECT = Byte.MIN_VALUE;
}
}

protected final void initJBSEMP(String s) {
if (!s.trim().isEmpty()) {
JBSEMP = Byte.parseByte(s);
} else {
JBSEMP = Byte.MIN_VALUE;
}
}

protected final void initJBSIZE(String s) {
if (!s.trim().isEmpty()) {
JBSIZE = Byte.parseByte(s);
} else {
JBSIZE = Byte.MIN_VALUE;
}
}

protected final void initJBSTAT(String s) {
if (!s.trim().isEmpty()) {
JBSTAT = Byte.parseByte(s);
} else {
JBSTAT = Byte.MIN_VALUE;
}
}

protected final void initJBTTWT(String s) {
if (!s.trim().isEmpty()) {
JBTTWT = Short.parseShort(s);
} else {
JBTTWT = Short.MIN_VALUE;
}
}

protected final void initJLBOSS(String s) {
if (!s.trim().isEmpty()) {
JLBOSS = Byte.parseByte(s);
} else {
JLBOSS = Byte.MIN_VALUE;
}
}

protected final void initJLENDY(String s) {
if (!s.trim().isEmpty()) {
JLENDY = Short.parseShort(s);
} else {
JLENDY = Short.MIN_VALUE;
}
}

protected final void initJLISCO88_CC(String s) {
if (!s.trim().isEmpty()) {
JLISCO88_CC = Short.parseShort(s);
} else {
JLISCO88_CC = Short.MIN_VALUE;
}
}

protected final void initJLMNGR(String s) {
if (!s.trim().isEmpty()) {
JLMNGR = Byte.parseByte(s);
} else {
JLMNGR = Byte.MIN_VALUE;
}
}

protected final void initJLNSSEC8_DV(String s) {
if (!s.trim().isEmpty()) {
JLNSSEC8_DV = Byte.parseByte(s);
} else {
JLNSSEC8_DV = Byte.MIN_VALUE;
}
}

protected final void initJLSEMP(String s) {
if (!s.trim().isEmpty()) {
JLSEMP = Byte.parseByte(s);
} else {
JLSEMP = Byte.MIN_VALUE;
}
}

protected final void initJLSIZE(String s) {
if (!s.trim().isEmpty()) {
JLSIZE = Byte.parseByte(s);
} else {
JLSIZE = Byte.MIN_VALUE;
}
}

protected final void initJSACCS(String s) {
if (!s.trim().isEmpty()) {
JSACCS = Byte.parseByte(s);
} else {
JSACCS = Byte.MIN_VALUE;
}
}

protected final void initJSBOSS(String s) {
if (!s.trim().isEmpty()) {
JSBOSS = Byte.parseByte(s);
} else {
JSBOSS = Byte.MIN_VALUE;
}
}

protected final void initJSHRS(String s) {
if (!s.trim().isEmpty()) {
JSHRS = Double.parseDouble(s);
} else {
JSHRS = Double.NaN;
}
}

protected final void initJSPL(String s) {
if (!s.trim().isEmpty()) {
JSPL = Byte.parseByte(s);
} else {
JSPL = Byte.MIN_VALUE;
}
}

protected final void initJSPRBM(String s) {
if (!s.trim().isEmpty()) {
JSPRBM = Byte.parseByte(s);
} else {
JSPRBM = Byte.MIN_VALUE;
}
}

protected final void initJSPRBY4(String s) {
if (!s.trim().isEmpty()) {
JSPRBY4 = Short.parseShort(s);
} else {
JSPRBY4 = Short.MIN_VALUE;
}
}

protected final void initJSPREM(String s) {
if (!s.trim().isEmpty()) {
JSPREM = Byte.parseByte(s);
} else {
JSPREM = Byte.MIN_VALUE;
}
}

protected final void initJSPREY4(String s) {
if (!s.trim().isEmpty()) {
JSPREY4 = Short.parseShort(s);
} else {
JSPREY4 = Short.MIN_VALUE;
}
}

protected final void initJSPRF(String s) {
if (!s.trim().isEmpty()) {
JSPRF = Integer.parseInt(s);
} else {
JSPRF = Integer.MIN_VALUE;
}
}

protected final void initJSSIZE(String s) {
if (!s.trim().isEmpty()) {
JSSIZE = Byte.parseByte(s);
} else {
JSSIZE = Byte.MIN_VALUE;
}
}

protected final void initJSTTWT(String s) {
if (!s.trim().isEmpty()) {
JSTTWT = Byte.parseByte(s);
} else {
JSTTWT = Byte.MIN_VALUE;
}
}

protected final void initJSTTWTB(String s) {
if (!s.trim().isEmpty()) {
JSTTWTB = Short.parseShort(s);
} else {
JSTTWTB = Short.MIN_VALUE;
}
}

protected final void initJULK4WK(String s) {
if (!s.trim().isEmpty()) {
JULK4WK = Byte.parseByte(s);
} else {
JULK4WK = Byte.MIN_VALUE;
}
}

protected final void initJULKJB(String s) {
if (!s.trim().isEmpty()) {
JULKJB = Byte.parseByte(s);
} else {
JULKJB = Byte.MIN_VALUE;
}
}

protected final void initLKMOVE(String s) {
if (!s.trim().isEmpty()) {
LKMOVE = Byte.parseByte(s);
} else {
LKMOVE = Byte.MIN_VALUE;
}
}

protected final void initMEMORIG(String s) {
if (!s.trim().isEmpty()) {
MEMORIG = Byte.parseByte(s);
} else {
MEMORIG = Byte.MIN_VALUE;
}
}

protected final void initMLSTAT(String s) {
if (!s.trim().isEmpty()) {
MLSTAT = Byte.parseByte(s);
} else {
MLSTAT = Byte.MIN_VALUE;
}
}

protected final void initPAYGL(String s) {
if (!s.trim().isEmpty()) {
PAYGL = Integer.parseInt(s);
} else {
PAYGL = Integer.MIN_VALUE;
}
}

protected final void initPAYGU_DV(String s) {
if (!s.trim().isEmpty()) {
PAYGU_DV = Double.parseDouble(s);
} else {
PAYGU_DV = Double.NaN;
}
}

protected final void initPAYGU_IF(String s) {
if (!s.trim().isEmpty()) {
PAYGU_IF = Byte.parseByte(s);
} else {
PAYGU_IF = Byte.MIN_VALUE;
}
}

protected final void initPAYNL(String s) {
if (!s.trim().isEmpty()) {
PAYNL = Integer.parseInt(s);
} else {
PAYNL = Integer.MIN_VALUE;
}
}

protected final void initPAYNU_DV(String s) {
if (!s.trim().isEmpty()) {
PAYNU_DV = Double.parseDouble(s);
} else {
PAYNU_DV = Double.NaN;
}
}

protected final void initPAYNU_IF(String s) {
if (!s.trim().isEmpty()) {
PAYNU_IF = Byte.parseByte(s);
} else {
PAYNU_IF = Byte.MIN_VALUE;
}
}

protected final void initPAYN_DV(String s) {
if (!s.trim().isEmpty()) {
PAYN_DV = Double.parseDouble(s);
} else {
PAYN_DV = Double.NaN;
}
}

protected final void initPAYU(String s) {
if (!s.trim().isEmpty()) {
PAYU = Integer.parseInt(s);
} else {
PAYU = Integer.MIN_VALUE;
}
}

protected final void initPAYUG(String s) {
if (!s.trim().isEmpty()) {
PAYUG = Byte.parseByte(s);
} else {
PAYUG = Byte.MIN_VALUE;
}
}

protected final void initPAYUSL(String s) {
if (!s.trim().isEmpty()) {
PAYUSL = Byte.parseByte(s);
} else {
PAYUSL = Byte.MIN_VALUE;
}
}

protected final void initPIDP(String s) {
if (!s.trim().isEmpty()) {
PIDP = Integer.parseInt(s);
} else {
PIDP = Integer.MIN_VALUE;
}
}

protected final void initPJULK4WK(String s) {
if (!s.trim().isEmpty()) {
PJULK4WK = Byte.parseByte(s);
} else {
PJULK4WK = Byte.MIN_VALUE;
}
}

protected final void initPLBORNC(String s) {
if (!s.trim().isEmpty()) {
PLBORNC = Byte.parseByte(s);
} else {
PLBORNC = Byte.MIN_VALUE;
}
}

protected final void initPNO(String s) {
if (!s.trim().isEmpty()) {
PNO = Byte.parseByte(s);
} else {
PNO = Byte.MIN_VALUE;
}
}

protected final void initPPNO(String s) {
if (!s.trim().isEmpty()) {
PPNO = Byte.parseByte(s);
} else {
PPNO = Byte.MIN_VALUE;
}
}

protected final void initPRIPN(String s) {
if (!s.trim().isEmpty()) {
PRIPN = Byte.parseByte(s);
} else {
PRIPN = Byte.MIN_VALUE;
}
}

protected final void initRACH16_DV(String s) {
if (!s.trim().isEmpty()) {
RACH16_DV = Byte.parseByte(s);
} else {
RACH16_DV = Byte.MIN_VALUE;
}
}

protected final void initSCEND(String s) {
if (!s.trim().isEmpty()) {
SCEND = Byte.parseByte(s);
} else {
SCEND = Byte.MIN_VALUE;
}
}

protected final void initSCGHQ1_DV(String s) {
if (!s.trim().isEmpty()) {
SCGHQ1_DV = Byte.parseByte(s);
} else {
SCGHQ1_DV = Byte.MIN_VALUE;
}
}

protected final void initSCGHQ2_DV(String s) {
if (!s.trim().isEmpty()) {
SCGHQ2_DV = Byte.parseByte(s);
} else {
SCGHQ2_DV = Byte.MIN_VALUE;
}
}

protected final void initSCGHQA(String s) {
if (!s.trim().isEmpty()) {
SCGHQA = Byte.parseByte(s);
} else {
SCGHQA = Byte.MIN_VALUE;
}
}

protected final void initSCGHQB(String s) {
if (!s.trim().isEmpty()) {
SCGHQB = Byte.parseByte(s);
} else {
SCGHQB = Byte.MIN_VALUE;
}
}

protected final void initSCGHQC(String s) {
if (!s.trim().isEmpty()) {
SCGHQC = Byte.parseByte(s);
} else {
SCGHQC = Byte.MIN_VALUE;
}
}

protected final void initSCGHQD(String s) {
if (!s.trim().isEmpty()) {
SCGHQD = Byte.parseByte(s);
} else {
SCGHQD = Byte.MIN_VALUE;
}
}

protected final void initSCGHQE(String s) {
if (!s.trim().isEmpty()) {
SCGHQE = Byte.parseByte(s);
} else {
SCGHQE = Byte.MIN_VALUE;
}
}

protected final void initSCGHQF(String s) {
if (!s.trim().isEmpty()) {
SCGHQF = Byte.parseByte(s);
} else {
SCGHQF = Byte.MIN_VALUE;
}
}

protected final void initSCGHQG(String s) {
if (!s.trim().isEmpty()) {
SCGHQG = Byte.parseByte(s);
} else {
SCGHQG = Byte.MIN_VALUE;
}
}

protected final void initSCGHQH(String s) {
if (!s.trim().isEmpty()) {
SCGHQH = Byte.parseByte(s);
} else {
SCGHQH = Byte.MIN_VALUE;
}
}

protected final void initSCGHQI(String s) {
if (!s.trim().isEmpty()) {
SCGHQI = Byte.parseByte(s);
} else {
SCGHQI = Byte.MIN_VALUE;
}
}

protected final void initSCGHQJ(String s) {
if (!s.trim().isEmpty()) {
SCGHQJ = Byte.parseByte(s);
} else {
SCGHQJ = Byte.MIN_VALUE;
}
}

protected final void initSCGHQK(String s) {
if (!s.trim().isEmpty()) {
SCGHQK = Byte.parseByte(s);
} else {
SCGHQK = Byte.MIN_VALUE;
}
}

protected final void initSCGHQL(String s) {
if (!s.trim().isEmpty()) {
SCGHQL = Byte.parseByte(s);
} else {
SCGHQL = Byte.MIN_VALUE;
}
}

protected final void initSCHOOL(String s) {
if (!s.trim().isEmpty()) {
SCHOOL = Byte.parseByte(s);
} else {
SCHOOL = Byte.MIN_VALUE;
}
}

protected final void initSEX(String s) {
if (!s.trim().isEmpty()) {
SEX = Byte.parseByte(s);
} else {
SEX = Byte.MIN_VALUE;
}
}

protected final void initYR2UK4(String s) {
if (!s.trim().isEmpty()) {
YR2UK4 = Short.parseShort(s);
} else {
YR2UK4 = Short.MIN_VALUE;
}
}

public byte getAIDHH() {
return AIDHH;
}

public byte getAIDHRS() {
return AIDHRS;
}

public byte getAIDXHH() {
return AIDXHH;
}

public byte getCARUSE() {
return CARUSE;
}

public byte getFEEND() {
return FEEND;
}

protected double FIMNGRS_DV() {
return FIMNGRS_DV;
}

protected double FIMNLABGRS_DV() {
return FIMNLABGRS_DV;
}

public byte getFINNOW() {
return FINNOW;
}

public byte getGOR_DV() {
return GOR_DV;
}

public byte getHGBIOF() {
return HGBIOF;
}

public byte getHGBIOM() {
return HGBIOM;
}

public byte getHHORIG() {
return HHORIG;
}

public int getHIDP() {
return HIDP;
}

public byte getHIQUAL_DV() {
return HIQUAL_DV;
}

public byte getIENDDATHH() {
return IENDDATHH;
}

public byte getISTRTDATD() {
return ISTRTDATD;
}

public byte getISTRTDATHH() {
return ISTRTDATHH;
}

public byte getISTRTDATM() {
return ISTRTDATM;
}

public byte getIVFIO() {
return IVFIO;
}

public byte getIVPRSNT() {
return IVPRSNT;
}

public byte getJ2HAS() {
return J2HAS;
}

public short getJ2HRS() {
return J2HRS;
}

protected double J2PAY_DV() {
return J2PAY_DV;
}

public byte getJ2PAY_IF() {
return J2PAY_IF;
}

public byte getJ2SEMP() {
return J2SEMP;
}

public byte getJBBGD() {
return JBBGD;
}

public byte getJBBGM() {
return JBBGM;
}

public short getJBBGY() {
return JBBGY;
}

public byte getJBFT_DV() {
return JBFT_DV;
}

public byte getJBHAD() {
return JBHAD;
}

public byte getJBHAS() {
return JBHAS;
}

protected double JBHRS() {
return JBHRS;
}

public short getJBISCO88_CC() {
return JBISCO88_CC;
}

public byte getJBMNGR() {
return JBMNGR;
}

public byte getJBNSSEC8_DV() {
return JBNSSEC8_DV;
}

public byte getJBOFF() {
return JBOFF;
}

public byte getJBOT() {
return JBOT;
}

public byte getJBOTPD() {
return JBOTPD;
}

public byte getJBPL() {
return JBPL;
}

public byte getJBSECT() {
return JBSECT;
}

public byte getJBSEMP() {
return JBSEMP;
}

public byte getJBSIZE() {
return JBSIZE;
}

public byte getJBSTAT() {
return JBSTAT;
}

public short getJBTTWT() {
return JBTTWT;
}

public byte getJLBOSS() {
return JLBOSS;
}

public short getJLENDY() {
return JLENDY;
}

public short getJLISCO88_CC() {
return JLISCO88_CC;
}

public byte getJLMNGR() {
return JLMNGR;
}

public byte getJLNSSEC8_DV() {
return JLNSSEC8_DV;
}

public byte getJLSEMP() {
return JLSEMP;
}

public byte getJLSIZE() {
return JLSIZE;
}

public byte getJSACCS() {
return JSACCS;
}

public byte getJSBOSS() {
return JSBOSS;
}

protected double JSHRS() {
return JSHRS;
}

public byte getJSPL() {
return JSPL;
}

public byte getJSPRBM() {
return JSPRBM;
}

public short getJSPRBY4() {
return JSPRBY4;
}

public byte getJSPREM() {
return JSPREM;
}

public short getJSPREY4() {
return JSPREY4;
}

public int getJSPRF() {
return JSPRF;
}

public byte getJSSIZE() {
return JSSIZE;
}

public byte getJSTTWT() {
return JSTTWT;
}

public short getJSTTWTB() {
return JSTTWTB;
}

public byte getJULK4WK() {
return JULK4WK;
}

public byte getJULKJB() {
return JULKJB;
}

public byte getLKMOVE() {
return LKMOVE;
}

public byte getMEMORIG() {
return MEMORIG;
}

public byte getMLSTAT() {
return MLSTAT;
}

public int getPAYGL() {
return PAYGL;
}

protected double PAYGU_DV() {
return PAYGU_DV;
}

public byte getPAYGU_IF() {
return PAYGU_IF;
}

public int getPAYNL() {
return PAYNL;
}

protected double PAYNU_DV() {
return PAYNU_DV;
}

public byte getPAYNU_IF() {
return PAYNU_IF;
}

protected double PAYN_DV() {
return PAYN_DV;
}

public int getPAYU() {
return PAYU;
}

public byte getPAYUG() {
return PAYUG;
}

public byte getPAYUSL() {
return PAYUSL;
}

public int getPIDP() {
return PIDP;
}

public byte getPJULK4WK() {
return PJULK4WK;
}

public byte getPLBORNC() {
return PLBORNC;
}

public byte getPNO() {
return PNO;
}

public byte getPPNO() {
return PPNO;
}

public byte getPRIPN() {
return PRIPN;
}

public byte getRACH16_DV() {
return RACH16_DV;
}

public byte getSCEND() {
return SCEND;
}

public byte getSCGHQ1_DV() {
return SCGHQ1_DV;
}

public byte getSCGHQ2_DV() {
return SCGHQ2_DV;
}

public byte getSCGHQA() {
return SCGHQA;
}

public byte getSCGHQB() {
return SCGHQB;
}

public byte getSCGHQC() {
return SCGHQC;
}

public byte getSCGHQD() {
return SCGHQD;
}

public byte getSCGHQE() {
return SCGHQE;
}

public byte getSCGHQF() {
return SCGHQF;
}

public byte getSCGHQG() {
return SCGHQG;
}

public byte getSCGHQH() {
return SCGHQH;
}

public byte getSCGHQI() {
return SCGHQI;
}

public byte getSCGHQJ() {
return SCGHQJ;
}

public byte getSCGHQK() {
return SCGHQK;
}

public byte getSCGHQL() {
return SCGHQL;
}

public byte getSCHOOL() {
return SCHOOL;
}

public byte getSEX() {
return SEX;
}

public short getYR2UK4() {
return YR2UK4;
}

}