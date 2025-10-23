function solution(today, terms, privacies) {
  function dateToDays(date) {
    const [year, month, day] = date.split('.').map(Number);
    return year * 12 * 28 + month * 28 + day;
  }

  const termInfo = {};
  for (let t of terms) {
    const [type, months] = t.split(' ');
    termInfo[type] = Number(months);
  }

  const todayDays = dateToDays(today);
  const result = [];

  for (let i = 0; i < privacies.length; i++) {
    const [date, type] = privacies[i].split(' ');
    const collectDays = dateToDays(date);
    const validMonths = termInfo[type];
    const expireDays = collectDays + validMonths * 28 - 1;
    if (expireDays < todayDays) {
      result.push(i + 1);
    }
  }

  return result;
}
