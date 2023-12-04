 def minWindow(self, s: str, t: str) -> str:
     #Brute Force(Test Case Failed) 
     if len(s) >= len(t):
          t_dic = {}

          for i in range(len(t)):
              if t[i] in t_dic:
                  t_dic[t[i]] += 1
              else:
                  t_dic[t[i]] = 1

          counter = 0
          i, j = 0, 0
          min_len = float('inf')
          index_i, index_j = 0, 0

          while j < len(s):
              if s[j] in t_dic:
                  if t_dic[s[j]] > 0:
                      counter += 1
                  t_dic[s[j]] -= 1

              while counter == len(t):
                  if j - i < min_len:
                      min_len = j - i
                      index_i = i
                      index_j = j

                  if s[i] in t_dic:
                      t_dic[s[i]] += 1
                      if t_dic[s[i]] > 0:
                          counter -= 1

                  i += 1

              j += 1

          return s[index_i:index_j + 1]

      else:
          return ""
      # Time complexity: O(n)
      # Space complexity: O(len(t))
  
      #optimal Way 
      if len(s) >= len(t):
            t_dic = {}

            for i in range(len(t)):
                if t[i] in t_dic:
                    t_dic[t[i]] += 1
                else:
                    t_dic[t[i]] = 1

            counter = 0
            i, j = 0, 0
            min_len = float('inf')
            index_i, index_j = 0, 0

            while j < len(s):
                if s[j] in t_dic:
                    if t_dic[s[j]] > 0:
                        counter += 1
                    t_dic[s[j]] -= 1

                while counter == len(t):
                    if j - i < min_len:
                        min_len = j - i
                        index_i = i
                        index_j = j

                    if s[i] in t_dic:
                        t_dic[s[i]] += 1
                        if t_dic[s[i]] > 0:
                            counter -= 1

                    i += 1

                j += 1

            return s[index_i:index_j + 1] if min_len != float('inf') else ""

        else:
            return ""
         # Time complexity: O(n)
         # Space complexity: O(len(t))
