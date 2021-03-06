package gcp.external.model.membership;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MembershipSavePointReq extends MembershipBase {

	public MembershipSavePointReq() {

	}
	@JsonProperty("BRND_CD")
	private String	brndCd;																						//BRND_CD 브랜드코드
	@JsonProperty("STOR_NO")
	private String	storNo;																			//STOR_NO 가맹점코드
	@JsonProperty("TRSC_ORGN_DV_CD")
	private String	trscOrgnDvCd;
	@JsonProperty("MMB_CERT_DV_CD")
	private String	mmbCertDvCd;								//MMB_CERT_DV_CD 회원인증구분코드
	@JsonProperty("MMB_CERT_DV_VLU")
	private String	mmbCertDvVlu;							//MMB_CERT_DV_VLU 회원인증구분값
	@JsonProperty("TOT_SEL_AMT")
	private String	totSelAmt;													//TOT_SEL_AMT 총매출금액
	@JsonProperty("TOT_DC_AMT")
	private String	totDcAmt;														//TOT_DC_AMT 총할인금액
	@JsonProperty("MBRSH_DC_AMT")
	private String	mbrshDcAmt;													//MBRSH_DC_AMT 멤버십할인금액
	@JsonProperty("ACML_TGT_AMT")
	private String	acmlTgtAmt;													//ACML_TGT_AMT 포인트적립대상금액
	@JsonProperty("TRSC_RSN_CD")
	private String	trscRsnCd;													//TRSC_RSN_CD 거래사유코드
	@JsonProperty("MMB_BABY_SEQ_NO")
	private String	mmbBabySeqNo;
	@JsonProperty("PRDCT_CD")
	private String	prdctCd;
	@JsonProperty("AFT_ACML_YN")
	private String	aftacmlYn;												//AFT_ACML_YN 사후적립여부
	@JsonProperty("MBRSH_PINT_SETL_YN")
	private String	mbrshpintSetlYn;	//MBRSH_PINT_SETL_YN 멤버십포인트 결제여부
	@JsonProperty("PINT_USE_TYP_CD")
	private String	pintUseTypCd;						//PINT_USE_TYP_CD 포인트사용유형코드
	@JsonProperty("USE_PINT")
	private String	usePint;													//USE_PINT 사용포인트
	@JsonProperty("UNIQ_RCGN_NO")
	private String	uniqRcgnNo;												//UNIQ_RCGN_NO 관계사고유식별번호
	@JsonProperty("ORG_APV_DT")
	private String	orgApvDt;													//ORG_APV_DT 원통합승인일자
	@JsonProperty("ORG_APV_NO")
	private String	orgApvNo;													//ORG_APV_NO 원통합승인번호
	@JsonProperty("ORG_UNIQ_RCGN_NO")
	private String	orgUniqRcgnNo;						//ORG_UNIQ_RCGN_NO 원관계사고유식별번호
	@JsonProperty("PINT_ACML_TYP_CD")
	private String	pintAcmlTypCd;						//PINT_ACML_TYP_CD 포인트적립유형코드
	@JsonProperty("ACML_PINT")
	private String	acmlPint;													//ACML_PINT 적립포인트
	@JsonProperty("VALD_TRM_DV_CD")
	private String	valdTrmDvCd;							//VALD_TRM_DV_CD 유효기간구분
	@JsonProperty("VALD_TRM")
	private String	valdTrm;													//VALD_TRM 유효개월수/기간
	@JsonProperty("RMK")
	private String	rmk;																//RMK 비고

	public String getBrndCd() {
		return brndCd;
	}

	public void setBrndCd(String brndCd) {
		this.brndCd = brndCd;
	}

	public String getStorNo() {
		return storNo;
	}

	public void setStorNo(String storNo) {
		this.storNo = storNo;
	}

	public String getTrscOrgnDvCd() {
		return trscOrgnDvCd;
	}

	public void setTrscOrgnDvCd(String trscOrgnDvCd) {
		this.trscOrgnDvCd = trscOrgnDvCd;
	}

	public String getMmbCertDvCd() {
		return mmbCertDvCd;
	}

	public void setMmbCertDvCd(String mmbCertDvCd) {
		this.mmbCertDvCd = mmbCertDvCd;
	}

	public String getMmbCertDvVlu() {
		return mmbCertDvVlu;
	}

	public void setMmbCertDvVlu(String mmbCertDvVlu) {
		this.mmbCertDvVlu = mmbCertDvVlu;
	}

	public String getTotSelAmt() {
		return totSelAmt;
	}

	public void setTotSelAmt(String totSelAmt) {
		this.totSelAmt = totSelAmt;
	}

	public String getTotDcAmt() {
		return totDcAmt;
	}

	public void setTotDcAmt(String totDcAmt) {
		this.totDcAmt = totDcAmt;
	}

	public String getMbrshDcAmt() {
		return mbrshDcAmt;
	}

	public void setMbrshDcAmt(String mbrshDcAmt) {
		this.mbrshDcAmt = mbrshDcAmt;
	}

	public String getAcmlTgtAmt() {
		return acmlTgtAmt;
	}

	public void setAcmlTgtAmt(String acmlTgtAmt) {
		this.acmlTgtAmt = acmlTgtAmt;
	}

	public String getTrscRsnCd() {
		return trscRsnCd;
	}

	public void setTrscRsnCd(String trscRsnCd) {
		this.trscRsnCd = trscRsnCd;
	}

	public String getMmbBabySeqNo() {
		return mmbBabySeqNo;
	}

	public void setMmbBabySeqNo(String mmbBabySeqNo) {
		this.mmbBabySeqNo = mmbBabySeqNo;
	}

	public String getPrdctCd() {
		return prdctCd;
	}

	public void setPrdctCd(String prdctCd) {
		this.prdctCd = prdctCd;
	}

	public String getAftacmlYn() {
		return aftacmlYn;
	}

	public void setAftacmlYn(String aftacmlYn) {
		this.aftacmlYn = aftacmlYn;
	}

	public String getMbrshpintSetlYn() {
		return mbrshpintSetlYn;
	}

	public void setMbrshpintSetlYn(String mbrshpintSetlYn) {
		this.mbrshpintSetlYn = mbrshpintSetlYn;
	}

	public String getPintUseTypCd() {
		return pintUseTypCd;
	}

	public void setPintUseTypCd(String pintUseTypCd) {
		this.pintUseTypCd = pintUseTypCd;
	}

	public String getUsePint() {
		return usePint;
	}

	public void setUsePint(String usePint) {
		this.usePint = usePint;
	}

	public String getUniqRcgnNo() {
		return uniqRcgnNo;
	}

	public void setUniqRcgnNo(String uniqRcgnNo) {
		this.uniqRcgnNo = uniqRcgnNo;
	}

	public String getOrgApvDt() {
		return orgApvDt;
	}

	public void setOrgApvDt(String orgApvDt) {
		this.orgApvDt = orgApvDt;
	}

	public String getOrgApvNo() {
		return orgApvNo;
	}

	public void setOrgApvNo(String orgApvNo) {
		this.orgApvNo = orgApvNo;
	}

	public String getOrgUniqRcgnNo() {
		return orgUniqRcgnNo;
	}

	public void setOrgUniqRcgnNo(String orgUniqRcgnNo) {
		this.orgUniqRcgnNo = orgUniqRcgnNo;
	}

	public String getPintAcmlTypCd() {
		return pintAcmlTypCd;
	}

	public void setPintAcmlTypCd(String pintAcmlTypCd) {
		this.pintAcmlTypCd = pintAcmlTypCd;
	}

	public String getAcmlPint() {
		return acmlPint;
	}

	public void setAcmlPint(String acmlPint) {
		this.acmlPint = acmlPint;
	}

	public String getValdTrmDvCd() {
		return valdTrmDvCd;
	}

	public void setValdTrmDvCd(String valdTrmDvCd) {
		this.valdTrmDvCd = valdTrmDvCd;
	}

	public String getValdTrm() {
		return valdTrm;
	}

	public void setValdTrm(String valdTrm) {
		this.valdTrm = valdTrm;
	}

	public String getRmk() {
		return rmk;
	}

	public void setRmk(String rmk) {
		this.rmk = rmk;
	}

}
