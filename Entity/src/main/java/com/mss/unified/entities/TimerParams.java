package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "TIMER_PARAMS", schema = "ATM")
public
class TimerParams {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "TIMER_CONFIG_NUM", nullable = false)
  private int timerConfigNum;

  @Column(name = "TIMER_CONFIG_LIBELLE")
  private String timerConfigLibelle;

  @Column(name = "TIMER_00")
  private String timer00;
  @Column(name = "TIMER_01")
  private String timer01;
  @Column(name = "TIMER_02")
  private String timer02;
  @Column(name = "TIMER_03")
  private String timer03;
  @Column(name = "TIMER_04")
  private String timer04;
  @Column(name = "TIMER_05")
  private String timer05;
  @Column(name = "TIMER_06")
  private String timer06;
  @Column(name = "TIMER_07")
  private String timer07;
  @Column(name = "TIMER_08")
  private String timer08;
  @Column(name = "TIMER_09")
  private String timer09;
  @Column(name = "TIMER_10")
  private String timer10;
  @Column(name = "TIMER_11")
  private String timer11;
  @Column(name = "TIMER_12")
  private String timer12;
  @Column(name = "TIMER_13")
  private String timer13;
  @Column(name = "TIMER_14")
  private String timer14;
  @Column(name = "TIMER_15")
  private String timer15;
  @Column(name = "TIMER_16")
  private String timer16;
  @Column(name = "TIMER_17")
  private String timer17;
  @Column(name = "TIMER_18")
  private String timer18;
  @Column(name = "TIMER_19")
  private String timer19;
  @Column(name = "TIMER_20")
  private String timer20;
  @Column(name = "TIMER_21")
  private String timer21;
  @Column(name = "TIMER_22")
  private String timer22;
  @Column(name = "TIMER_23")
  private String timer23;
  @Column(name = "TIMER_24")
  private String timer24;
  @Column(name = "TIMER_25")
  private String timer25;
  @Column(name = "TIMER_26")
  private String timer26;
  @Column(name = "TIMER_27")
  private String timer27;
  @Column(name = "TIMER_28")
  private String timer28;
  @Column(name = "TIMER_29")
  private String timer29;
  @Column(name = "TIMER_30")
  private String timer30;
  @Column(name = "TIMER_31")
  private String timer31;
  @Column(name = "TIMER_32")
  private String timer32;
  @Column(name = "TIMER_33")
  private String timer33;
  @Column(name = "TIMER_34")
  private String timer34;
  @Column(name = "TIMER_35")
  private String timer35;
  @Column(name = "TIMER_36")
  private String timer36;
  @Column(name = "TIMER_37")
  private String timer37;
  @Column(name = "TIMER_38")
  private String timer38;
  @Column(name = "TIMER_39")
  private String timer39;
  @Column(name = "TIMER_40")
  private String timer40;
  @Column(name = "TIMER_41")
  private String timer41;
  @Column(name = "TIMER_42")
  private String timer42;
  @Column(name = "TIMER_43")
  private String timer43;
  @Column(name = "TIMER_44")
  private String timer44;
  @Column(name = "TIMER_45")
  private String timer45;
  @Column(name = "TIMER_46")
  private String timer46;
  @Column(name = "TIMER_47")
  private String timer47;
  @Column(name = "TIMER_48")
  private String timer48;
  @Column(name = "TIMER_49")
  private String timer49;
  @Column(name = "TIMER_50")
  private String timer50;
  @Column(name = "TIMER_51")
  private String timer51;
  @Column(name = "TIMER_52")
  private String timer52;
  @Column(name = "TIMER_53")
  private String timer53;
  @Column(name = "TIMER_54")
  private String timer54;
  @Column(name = "TIMER_55")
  private String timer55;
  @Column(name = "TIMER_56")
  private String timer56;
  @Column(name = "TIMER_57")
  private String timer57;
  @Column(name = "TIMER_58")
  private String timer58;
  @Column(name = "TIMER_59")
  private String timer59;
  @Column(name = "TIMER_60")
  private String timer60;
  @Column(name = "TIMER_61")
  private String timer61;
  @Column(name = "TIMER_62")
  private String timer62;
  @Column(name = "TIMER_63")
  private String timer63;
  @Column(name = "TIMER_64")
  private String timer64;
  @Column(name = "TIMER_65")
  private String timer65;
  @Column(name = "TIMER_66")
  private String timer66;
  @Column(name = "TIMER_67")
  private String timer67;
  @Column(name = "TIMER_68")
  private String timer68;
  @Column(name = "TIMER_69")
  private String timer69;
  @Column(name = "TIMER_70")
  private String timer70;
  @Column(name = "TIMER_71")
  private String timer71;
  @Column(name = "TIMER_72")
  private String timer72;
  @Column(name = "TIMER_73")
  private String timer73;
  @Column(name = "TIMER_74")
  private String timer74;
  @Column(name = "TIMER_75")
  private String timer75;
  @Column(name = "TIMER_76")
  private String timer76;
  @Column(name = "TIMER_77")
  private String timer77;
  @Column(name = "TIMER_78")
  private String timer78;
  @Column(name = "TIMER_79")
  private String timer79;
  @Column(name = "TIMER_80")
  private String timer80;
  @Column(name = "TIMER_81")
  private String timer81;
  @Column(name = "TIMER_82")
  private String timer82;
  @Column(name = "TIMER_83")
  private String timer83;
  @Column(name = "TIMER_84")
  private String timer84;
  @Column(name = "TIMER_85")
  private String timer85;
  @Column(name = "TIMER_86")
  private String timer86;
  @Column(name = "TIMER_87")
  private String timer87;
  @Column(name = "TIMER_88")
  private String timer88;
  @Column(name = "TIMER_89")
  private String timer89;
  @Column(name = "TIMER_90")
  private String timer90;
  @Column(name = "TIMER_91")
  private String timer91;
  @Column(name = "TIMER_92")
  private String timer92;
  @Column(name = "TIMER_93")
  private String timer93;
  @Column(name = "TIMER_94")
  private String timer94;
  @Column(name = "TIMER_95")
  private String timer95;
  @Column(name = "TIMER_96")
  private String timer96;
  @Column(name = "TIMER_97")
  private String timer97;
  @Column(name = "TIMER_98")
  private String timer98;
  @Column(name = "TIMER_99")
  private String timer99;

  public String getTimer12() {
    return timer12;
  }

  public void setTimer12(String timer12) {
    this.timer12 = timer12;
  }

  public String getTimer25() {
    return timer25;
  }

  public void setTimer25(String timer25) {
    this.timer25 = timer25;
  }

  public String getTimer26() {
    return timer26;
  }

  public void setTimer26(String timer26) {
    this.timer26 = timer26;
  }

  public String getTimer27() {
    return timer27;
  }

  public void setTimer27(String timer27) {
    this.timer27 = timer27;
  }

  public String getTimer29() {
    return timer29;
  }

  public void setTimer29(String timer29) {
    this.timer29 = timer29;
  }

  public String getTimer30() {
    return timer30;
  }

  public void setTimer30(String timer30) {
    this.timer30 = timer30;
  }

  public String getTimer31() {
    return timer31;
  }

  public void setTimer31(String timer31) {
    this.timer31 = timer31;
  }

  public String getTimer32() {
    return timer32;
  }

  public void setTimer32(String timer32) {
    this.timer32 = timer32;
  }

  public String getTimer33() {
    return timer33;
  }

  public void setTimer33(String timer33) {
    this.timer33 = timer33;
  }

  public String getTimer34() {
    return timer34;
  }

  public void setTimer34(String timer34) {
    this.timer34 = timer34;
  }

  public String getTimer35() {
    return timer35;
  }

  public void setTimer35(String timer35) {
    this.timer35 = timer35;
  }

  public String getTimer36() {
    return timer36;
  }

  public void setTimer36(String timer36) {
    this.timer36 = timer36;
  }

  public String getTimer37() {
    return timer37;
  }

  public void setTimer37(String timer37) {
    this.timer37 = timer37;
  }

  public String getTimer38() {
    return timer38;
  }

  public void setTimer38(String timer38) {
    this.timer38 = timer38;
  }

  public String getTimer39() {
    return timer39;
  }

  public void setTimer39(String timer39) {
    this.timer39 = timer39;
  }

  public String getTimer40() {
    return timer40;
  }

  public void setTimer40(String timer40) {
    this.timer40 = timer40;
  }

  public String getTimer41() {
    return timer41;
  }

  public void setTimer41(String timer41) {
    this.timer41 = timer41;
  }

  public String getTimer42() {
    return timer42;
  }

  public void setTimer42(String timer42) {
    this.timer42 = timer42;
  }

  public String getTimer43() {
    return timer43;
  }

  public void setTimer43(String timer43) {
    this.timer43 = timer43;
  }

  public String getTimer44() {
    return timer44;
  }

  public void setTimer44(String timer44) {
    this.timer44 = timer44;
  }

  public String getTimer45() {
    return timer45;
  }

  public void setTimer45(String timer45) {
    this.timer45 = timer45;
  }

  public String getTimer46() {
    return timer46;
  }

  public void setTimer46(String timer46) {
    this.timer46 = timer46;
  }

  public String getTimer47() {
    return timer47;
  }

  public void setTimer47(String timer47) {
    this.timer47 = timer47;
  }

  public String getTimer48() {
    return timer48;
  }

  public void setTimer48(String timer48) {
    this.timer48 = timer48;
  }

  public String getTimer49() {
    return timer49;
  }

  public void setTimer49(String timer49) {
    this.timer49 = timer49;
  }

  public String getTimer50() {
    return timer50;
  }

  public void setTimer50(String timer50) {
    this.timer50 = timer50;
  }

  public String getTimer51() {
    return timer51;
  }

  public void setTimer51(String timer51) {
    this.timer51 = timer51;
  }

  public String getTimer52() {
    return timer52;
  }

  public void setTimer52(String timer52) {
    this.timer52 = timer52;
  }

  public String getTimer53() {
    return timer53;
  }

  public void setTimer53(String timer53) {
    this.timer53 = timer53;
  }

  public String getTimer54() {
    return timer54;
  }

  public void setTimer54(String timer54) {
    this.timer54 = timer54;
  }

  public String getTimer55() {
    return timer55;
  }

  public void setTimer55(String timer55) {
    this.timer55 = timer55;
  }

  public String getTimer56() {
    return timer56;
  }

  public void setTimer56(String timer56) {
    this.timer56 = timer56;
  }

  public String getTimer57() {
    return timer57;
  }

  public void setTimer57(String timer57) {
    this.timer57 = timer57;
  }

  public String getTimer58() {
    return timer58;
  }

  public void setTimer58(String timer58) {
    this.timer58 = timer58;
  }

  public String getTimer59() {
    return timer59;
  }

  public void setTimer59(String timer59) {
    this.timer59 = timer59;
  }

  public String getTimer60() {
    return timer60;
  }

  public void setTimer60(String timer60) {
    this.timer60 = timer60;
  }

  public String getTimer61() {
    return timer61;
  }

  public void setTimer61(String timer61) {
    this.timer61 = timer61;
  }

  public String getTimer62() {
    return timer62;
  }

  public void setTimer62(String timer62) {
    this.timer62 = timer62;
  }

  public String getTimer63() {
    return timer63;
  }

  public void setTimer63(String timer63) {
    this.timer63 = timer63;
  }

  public String getTimer64() {
    return timer64;
  }

  public void setTimer64(String timer64) {
    this.timer64 = timer64;
  }

  public String getTimer65() {
    return timer65;
  }

  public void setTimer65(String timer65) {
    this.timer65 = timer65;
  }

  public String getTimer66() {
    return timer66;
  }

  public void setTimer66(String timer66) {
    this.timer66 = timer66;
  }

  public String getTimer67() {
    return timer67;
  }

  public void setTimer67(String timer67) {
    this.timer67 = timer67;
  }

  public String getTimer68() {
    return timer68;
  }

  public void setTimer68(String timer68) {
    this.timer68 = timer68;
  }

  public String getTimer69() {
    return timer69;
  }

  public void setTimer69(String timer69) {
    this.timer69 = timer69;
  }

  public String getTimer70() {
    return timer70;
  }

  public void setTimer70(String timer70) {
    this.timer70 = timer70;
  }

  public String getTimer71() {
    return timer71;
  }

  public void setTimer71(String timer71) {
    this.timer71 = timer71;
  }

  public String getTimer72() {
    return timer72;
  }

  public void setTimer72(String timer72) {
    this.timer72 = timer72;
  }

  public String getTimer73() {
    return timer73;
  }

  public void setTimer73(String timer73) {
    this.timer73 = timer73;
  }

  public String getTimer74() {
    return timer74;
  }

  public void setTimer74(String timer74) {
    this.timer74 = timer74;
  }

  public String getTimer75() {
    return timer75;
  }

  public void setTimer75(String timer75) {
    this.timer75 = timer75;
  }

  public String getTimer76() {
    return timer76;
  }

  public void setTimer76(String timer76) {
    this.timer76 = timer76;
  }

  public String getTimer77() {
    return timer77;
  }

  public void setTimer77(String timer77) {
    this.timer77 = timer77;
  }

  public String getTimer78() {
    return timer78;
  }

  public void setTimer78(String timer78) {
    this.timer78 = timer78;
  }

  public String getTimer79() {
    return timer79;
  }

  public void setTimer79(String timer79) {
    this.timer79 = timer79;
  }

  public String getTimer80() {
    return timer80;
  }

  public void setTimer80(String timer80) {
    this.timer80 = timer80;
  }

  public String getTimer81() {
    return timer81;
  }

  public void setTimer81(String timer81) {
    this.timer81 = timer81;
  }

  public String getTimer82() {
    return timer82;
  }

  public void setTimer82(String timer82) {
    this.timer82 = timer82;
  }

  public String getTimer83() {
    return timer83;
  }

  public void setTimer83(String timer83) {
    this.timer83 = timer83;
  }

  public String getTimer84() {
    return timer84;
  }

  public void setTimer84(String timer84) {
    this.timer84 = timer84;
  }

  public String getTimer85() {
    return timer85;
  }

  public void setTimer85(String timer85) {
    this.timer85 = timer85;
  }

  public String getTimer86() {
    return timer86;
  }

  public void setTimer86(String timer86) {
    this.timer86 = timer86;
  }

  public String getTimer87() {
    return timer87;
  }

  public void setTimer87(String timer87) {
    this.timer87 = timer87;
  }

  public String getTimer88() {
    return timer88;
  }

  public void setTimer88(String timer88) {
    this.timer88 = timer88;
  }

  public String getTimer89() {
    return timer89;
  }

  public void setTimer89(String timer89) {
    this.timer89 = timer89;
  }

  public String getTimer90() {
    return timer90;
  }

  public void setTimer90(String timer90) {
    this.timer90 = timer90;
  }

  public String getTimer91() {
    return timer91;
  }

  public void setTimer91(String timer91) {
    this.timer91 = timer91;
  }

  public String getTimer92() {
    return timer92;
  }

  public void setTimer92(String timer92) {
    this.timer92 = timer92;
  }

  public String getTimer93() {
    return timer93;
  }

  public void setTimer93(String timer93) {
    this.timer93 = timer93;
  }

  public String getTimer94() {
    return timer94;
  }

  public void setTimer94(String timer94) {
    this.timer94 = timer94;
  }

  public String getTimer95() {
    return timer95;
  }

  public void setTimer95(String timer95) {
    this.timer95 = timer95;
  }

  public String getTimer96() {
    return timer96;
  }

  public void setTimer96(String timer96) {
    this.timer96 = timer96;
  }

  public String getTimer97() {
    return timer97;
  }

  public void setTimer97(String timer97) {
    this.timer97 = timer97;
  }

  public String getTimer98() {
    return timer98;
  }

  public void setTimer98(String timer98) {
    this.timer98 = timer98;
  }

  public String getTimer99() {
    return timer99;
  }

  public void setTimer99(String timer99) {
    this.timer99 = timer99;
  }

  public String getTimer09() {
    return timer09;
  }

  public void setTimer09(String timer09) {
    this.timer09 = timer09;
  }

  public String getTimer10() {
    return timer10;
  }

  public void setTimer10(String timer10) {
    this.timer10 = timer10;
  }

  public String getTimer11() {
    return timer11;
  }

  public void setTimer11(String timer11) {
    this.timer11 = timer11;
  }

  public String getTimer13() {
    return timer13;
  }

  public void setTimer13(String timer13) {
    this.timer13 = timer13;
  }

  public String getTimer14() {
    return timer14;
  }

  public void setTimer14(String timer14) {
    this.timer14 = timer14;
  }

  public String getTimer15() {
    return timer15;
  }

  public void setTimer15(String timer15) {
    this.timer15 = timer15;
  }

  public String getTimer16() {
    return timer16;
  }

  public void setTimer16(String timer16) {
    this.timer16 = timer16;
  }

  public String getTimer17() {
    return timer17;
  }

  public void setTimer17(String timer17) {
    this.timer17 = timer17;
  }

  public String getTimer18() {
    return timer18;
  }

  public void setTimer18(String timer18) {
    this.timer18 = timer18;
  }

  public String getTimer19() {
    return timer19;
  }

  public void setTimer19(String timer19) {
    this.timer19 = timer19;
  }

  public String getTimer20() {
    return timer20;
  }

  public void setTimer20(String timer20) {
    this.timer20 = timer20;
  }

  public String getTimer21() {
    return timer21;
  }

  public void setTimer21(String timer21) {
    this.timer21 = timer21;
  }

  public String getTimer22() {
    return timer22;
  }

  public void setTimer22(String timer22) {
    this.timer22 = timer22;
  }

  public String getTimer23() {
    return timer23;
  }

  public void setTimer23(String timer23) {
    this.timer23 = timer23;
  }

  public String getTimer24() {
    return timer24;
  }

  public void setTimer24(String timer24) {
    this.timer24 = timer24;
  }

  public String getTimer28() {
    return timer28;
  }

  public void setTimer28(String timer28) {
    this.timer28 = timer28;
  }

  public int getTimerConfigNum() {
    return timerConfigNum;
  }

  public void setTimerConfigNum(int timerConfigNum) {
    this.timerConfigNum = timerConfigNum;
  }

  public String getTimerConfigLibelle() {
    return timerConfigLibelle;
  }

  public void setTimerConfigLibelle(String timerConfigLibelle) {
    this.timerConfigLibelle = timerConfigLibelle;
  }

  public String getTimer00() {
    return timer00;
  }

  public void setTimer00(String timer00) {
    this.timer00 = timer00;
  }

  public String getTimer01() {
    return timer01;
  }

  public void setTimer01(String timer01) {
    this.timer01 = timer01;
  }

  public String getTimer02() {
    return timer02;
  }

  public void setTimer02(String timer02) {
    this.timer02 = timer02;
  }

  public String getTimer03() {
    return timer03;
  }

  public void setTimer03(String timer03) {
    this.timer03 = timer03;
  }

  public String getTimer04() {
    return timer04;
  }

  public void setTimer04(String timer04) {
    this.timer04 = timer04;
  }

  public String getTimer05() {
    return timer05;
  }

  public void setTimer05(String timer05) {
    this.timer05 = timer05;
  }

  public String getTimer06() {
    return timer06;
  }

  public void setTimer06(String timer06) {
    this.timer06 = timer06;
  }

  public String getTimer07() {
    return timer07;
  }

  public void setTimer07(String timer07) {
    this.timer07 = timer07;
  }

  public String getTimer08() {
    return timer08;
  }

  public void setTimer08(String timer08) {
    this.timer08 = timer08;
  }


  @Override
  public String toString() {
    return "TimerParams{" +
        "timerConfigNum=" + timerConfigNum +
        ", timerConfigLibelle='" + timerConfigLibelle + '\'' +
        ", timer00='" + timer00 + '\'' +
        ", timer01='" + timer01 + '\'' +
        ", timer02='" + timer02 + '\'' +
        ", timer03='" + timer03 + '\'' +
        ", timer04='" + timer04 + '\'' +
        ", timer05='" + timer05 + '\'' +
        ", timer06='" + timer06 + '\'' +
        ", timer07='" + timer07 + '\'' +
        ", timer08='" + timer08 + '\'' +
        ", timer09='" + timer09 + '\'' +
        ", timer10='" + timer10 + '\'' +
        ", timer11='" + timer11 + '\'' +
        ", timer12='" + timer12 + '\'' +
        ", timer13='" + timer13 + '\'' +
        ", timer14='" + timer14 + '\'' +
        ", timer15='" + timer15 + '\'' +
        ", timer16='" + timer16 + '\'' +
        ", timer17='" + timer17 + '\'' +
        ", timer18='" + timer18 + '\'' +
        ", timer19='" + timer19 + '\'' +
        ", timer20='" + timer20 + '\'' +
        ", timer21='" + timer21 + '\'' +
        ", timer22='" + timer22 + '\'' +
        ", timer23='" + timer23 + '\'' +
        ", timer24='" + timer24 + '\'' +
        ", timer25='" + timer25 + '\'' +
        ", timer26='" + timer26 + '\'' +
        ", timer27='" + timer27 + '\'' +
        ", timer28='" + timer28 + '\'' +
        ", timer29='" + timer29 + '\'' +
        ", timer30='" + timer30 + '\'' +
        ", timer31='" + timer31 + '\'' +
        ", timer32='" + timer32 + '\'' +
        ", timer33='" + timer33 + '\'' +
        ", timer34='" + timer34 + '\'' +
        ", timer35='" + timer35 + '\'' +
        ", timer36='" + timer36 + '\'' +
        ", timer37='" + timer37 + '\'' +
        ", timer38='" + timer38 + '\'' +
        ", timer39='" + timer39 + '\'' +
        ", timer40='" + timer40 + '\'' +
        ", timer41='" + timer41 + '\'' +
        ", timer42='" + timer42 + '\'' +
        ", timer43='" + timer43 + '\'' +
        ", timer44='" + timer44 + '\'' +
        ", timer45='" + timer45 + '\'' +
        ", timer46='" + timer46 + '\'' +
        ", timer47='" + timer47 + '\'' +
        ", timer48='" + timer48 + '\'' +
        ", timer49='" + timer49 + '\'' +
        ", timer50='" + timer50 + '\'' +
        ", timer51='" + timer51 + '\'' +
        ", timer52='" + timer52 + '\'' +
        ", timer53='" + timer53 + '\'' +
        ", timer54='" + timer54 + '\'' +
        ", timer55='" + timer55 + '\'' +
        ", timer56='" + timer56 + '\'' +
        ", timer57='" + timer57 + '\'' +
        ", timer58='" + timer58 + '\'' +
        ", timer59='" + timer59 + '\'' +
        ", timer60='" + timer60 + '\'' +
        ", timer61='" + timer61 + '\'' +
        ", timer62='" + timer62 + '\'' +
        ", timer63='" + timer63 + '\'' +
        ", timer64='" + timer64 + '\'' +
        ", timer65='" + timer65 + '\'' +
        ", timer66='" + timer66 + '\'' +
        ", timer67='" + timer67 + '\'' +
        ", timer68='" + timer68 + '\'' +
        ", timer69='" + timer69 + '\'' +
        ", timer70='" + timer70 + '\'' +
        ", timer71='" + timer71 + '\'' +
        ", timer72='" + timer72 + '\'' +
        ", timer73='" + timer73 + '\'' +
        ", timer74='" + timer74 + '\'' +
        ", timer75='" + timer75 + '\'' +
        ", timer76='" + timer76 + '\'' +
        ", timer77='" + timer77 + '\'' +
        ", timer78='" + timer78 + '\'' +
        ", timer79='" + timer79 + '\'' +
        ", timer80='" + timer80 + '\'' +
        ", timer81='" + timer81 + '\'' +
        ", timer82='" + timer82 + '\'' +
        ", timer83='" + timer83 + '\'' +
        ", timer84='" + timer84 + '\'' +
        ", timer85='" + timer85 + '\'' +
        ", timer86='" + timer86 + '\'' +
        ", timer87='" + timer87 + '\'' +
        ", timer88='" + timer88 + '\'' +
        ", timer89='" + timer89 + '\'' +
        ", timer90='" + timer90 + '\'' +
        ", timer91='" + timer91 + '\'' +
        ", timer92='" + timer92 + '\'' +
        ", timer93='" + timer93 + '\'' +
        ", timer94='" + timer94 + '\'' +
        ", timer95='" + timer95 + '\'' +
        ", timer96='" + timer96 + '\'' +
        ", timer97='" + timer97 + '\'' +
        ", timer98='" + timer98 + '\'' +
        ", timer99='" + timer99 + '\'' +
        '}';
  }
}
