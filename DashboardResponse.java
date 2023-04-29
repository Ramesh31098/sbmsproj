package in.ashokIt.binding;

public class DashboardResponse {
private Integer totalEnqCnt;
private Integer enroledCnt;
private Integer lostCnt;
public Integer getTotalEnq() {
	return totalEnqCnt;
}
public void setTotalEnq(Integer totalEnq) {
	this.totalEnqCnt = totalEnq;
}
public Integer getEnroledCnt() {
	return enroledCnt;
}
public void setEnroledCnt(Integer enroledCnt) {
	this.enroledCnt = enroledCnt;
}
public Integer getLostCnt() {
	return lostCnt;
}
public void setLostCnt(Integer lostCnt) {
	this.lostCnt = lostCnt;
}


}
