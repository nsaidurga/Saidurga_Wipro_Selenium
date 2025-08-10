/*
 5: Priority Levels with Extra Data
Implement enum PriorityLevel with constants (LOW, MEDIUM, HIGH, CRITICAL), each having:
a)	A numeric severity code.
b)	A boolean isUrgent() if severity ≥ some threshold.
Print descriptions and check urgency.
 */
package Day6;
public class PriorityDemo {
	enum PriorityLevel{
		LOW(1),
		MEDIUM(2),
		HIGH(3),
		CRITICAL(4);
		
		private final int severityCode;
		
		PriorityLevel(int severityCode){
			this.severityCode=severityCode;
		}
		public int getSeverityCode() {
			return severityCode;
		}
		public boolean isUrgent() {
			return severityCode>=3;
		}
		public String getDescription() {
			return name()+" (Severity: "+severityCode+", Urgent"+isUrgent()+")";
		}
	}
	public static void main(String[] args) {
		for(PriorityLevel p:PriorityLevel.values()) {
			System.out.println(p.getDescription());
		}
	}
}
/*
output:
LOW (Severity: 1, Urgentfalse)
MEDIUM (Severity: 2, Urgentfalse)
HIGH (Severity: 3, Urgenttrue)
CRITICAL (Severity: 4, Urgenttrue)
*/